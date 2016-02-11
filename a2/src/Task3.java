
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {

	public static void insertion (int [] array){
        long start = System.currentTimeMillis();
		for (int i = 1; i < array.length; i++) {

			// Invariant: a[0..i-1] is already sorted.
			final int cur = array[i];
			// Now insert cur into a[0..i-1],
			// shifting greater elements upward.
			int j = i;
			while (j > 0 && array[j-1] > cur){

				array[j] = array[--j];
				array[j] = cur;
			}
		}
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Sorting with insertion took " + duration + " ms");
//        System.out.println("Insertion method: " + Arrays.toString(array));

	}

    public static void  sort (int [] array){
        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Sorting with Arrays.sort took " + duration + " ms");
//        System.out.println("Arrays.sort method: " + Arrays.toString(array));



    }

	public static void main(String[] args) {

        for (int j = 0; j < 20; j++) {
            int[] a = new int[(int) (Math.random()*10001+20001)];
            for (int i = 0; i< a.length; i++){
                a[i]= (int) (Math.random()*1000000000);
            }

            int [] b = a.clone();

            insertion(a);
            sort(b);
        }

	}

}

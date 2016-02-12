/**
 * Created by jpp on 10/02/16.
 */
public class SortedListImpl<E> implements SortedList {

    public Comparable[] list;
    public int count;

    public SortedListImpl() {
        super();
        list = new Comparable[5];
        count = 0;
    }

    @Override
    public void add(Comparable elem) {
        if(count + 1 > list.length)
        {
            Comparable[] oldList = list;
            list = new Comparable[oldList.length * 2];
            for(int i = 0; i < count; i++)
            {
                list[i] = oldList[i];
            }
        }

        if(count == 0)
        {
            list[count] = elem;
            count++;
        }
        else {
            int placement = bSearch(0, count-1, elem);

            if(placement < count) {
                for(int i = count-1; i >= placement; i--) {
                    list[i+1] = list[i];
                }
            }

            list[placement] = elem;
            count++;
        }
    }

    public int bSearch(int min, int max, Comparable elem)
    {
        int midpoint = min + ((max - min) / 2);
        if (min < max)
        {
            int comp = elem.compareTo(list[midpoint]);
            if(comp < 0) {//element is smaller than midpoint
                return bSearch(min, midpoint - 1, elem);//Search below the midpoint
            }
            else if(comp > 0) {// element is larger than midpoint
                return bSearch(midpoint + 1, max, elem);//Search above the midpoint
            }
            else { // element is found
                return midpoint;
            }
        }
        else
        {
            if(elem.compareTo(list[midpoint]) > 0) //if element is larger than min
                return min+1; //prevents error when appending onto the array
            return min;
        }
    }

    @Override
    public void addSortedArray(Comparable[] arr) {
        int size = this.list.length + arr.length;
        Comparable[] newList = new Comparable[size];
        int i, j, current;
        i = 0;
        j = 0;
        current = 0;

        while(i < count && j < arr.length){

            if(list[i].compareTo(arr[j]) == -1){
                newList[current] = list[i];
                i++;
            }else{
                newList[current] = arr[j];
                j++;
            }
            current++;
        }

        while(i < count){
            newList[current] = list[i];
            i++;
            current++;
        }

        while(j < arr.length){
            newList[current] = arr[j];
            j++;
            current++;
        }
        list = newList;
        count = current;
    }

    @Override
    public Comparable get(int ix) {
        return list[ix];
    }

    @Override
    public int firstIndex(Comparable elem) {
        return bSearch(0, count-1, elem);
    }

    @Override
    public int lastIndex(Comparable elem) {
        int low = 0;
        int high = count - 1;
        int found = -1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = list[mid].compareTo(elem);

            if (midVal < 0) {
                low = mid + 1;
            } else if (midVal > 0) {
                high = mid - 1;
            } else {
                found = mid;
                // For last occurrence:
                low = mid + 1;
                // For first occurrence:
                // high = mid - 1;
            }

            if(found == -1 && midVal < 0) //if element is smaller than mid
                return high;
        }
        return found;
    }

    @Override
    public boolean contains(Comparable elem) {
        return false;
    }

    @Override
    public int countBetween(Comparable lo, Comparable hi) {
        return 0;
    }

    @Override
    public int size() {
        return count;
    }

    public String toString()
    {
        String result = "";
        for (int i = 0; i < count; i++)
        {
            result += list[i] + " ";
        }

        return result ;
    }
}
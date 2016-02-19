/**
 * Created by G05 on 10/02/16.
 */
public class SortedListImpl<E extends Comparable<E>> implements SortedList<E> {

    public E[] list;
    //variable to keep track of how many elements the list actually has.
    public int count;


    public SortedListImpl() {
        super();
        //Creating a new comparable list with 5 objects
        list = (E[]) new Comparable[5];
        //Assign the count from 0.
        count = 0;
    }

    @Override
    //
    public void add(E elem) {
        //checking if the list will go over the limits of the old list
        if(count + 1 > list.length)
        {
            E[] oldList = list;
            //double the length from the old list and make a new list
            list = (E[]) new Comparable[oldList.length * 2];
            //adding the objects in the old list to the new list
            for(int i = 0; i < count; i++)
            {
                list[i] = oldList[i];
            }
        }
            //If there is nothing in the list just add the new elem in the list
        if(count == 0)
        {
            list[count] = elem;
            count++;
        }
        else {
            //run the binary search to find the position to place the elem
            int placement = bSearch(0, count-1, elem, false);

            if(placement < count) {
                //shifting all the element one place forward from the placement position
                for(int i = count-1; i >= placement; i--) {
                    list[i+1] = list[i];
                }
            }
            //add the elem in the list
            list[placement] = elem;
            count++;
        }
    }

    public int bSearch(int min, int max, E elem, boolean findLast)
    {
        //in case if the max+min goes over the limits
        //this is the safer version to find the mid point
        int midpoint = min + ((max - min) / 2);
        //checking if the min is smaller the max
        if (min < max)
        {
            int comp = elem.compareTo(list[midpoint]);
            if(comp < 0) {//element is smaller than midpoint
                return bSearch(min, midpoint - 1, elem, findLast);//Search below the midpoint
            }
            else if(comp > 0) {// element is larger than midpoint
                return bSearch(midpoint + 1, max, elem, findLast);//Search above the midpoint
            }
            else { // element is found
                if (!findLast && (midpoint > 0 && elem.compareTo(list[midpoint - 1]) == 0)) {
                    return bSearch(min, midpoint - 1, elem, false);
                } else if (findLast) {
                    if (midpoint < count && elem.compareTo(list[midpoint + 1]) == 0) {
                        return bSearch(midpoint + 1, max, elem, true);
                    }
                }

                return midpoint;
            }
        }
        else
        {


            if(elem.compareTo(list[midpoint]) > 0) //if element is larger than min
            {
                if(findLast)
                {
                    return min;
                }

                return min+1; //prevents error when appending onto the array
            }

            if(findLast &&(min == 0 && elem.compareTo(list[0]) < 0))
            {
                return -1;
            }

            return min;

        }
    }

    @Override
    public void addSortedArray(E[] arr) {
        int size = this.list.length + arr.length;
        E[] newList = (E[])new Comparable[size];
        int i, j, current;
        i = 0;
        j = 0;
        current = 0;

        while(i < count && j < arr.length){
            //checking the element i from list is "smaller" than the j from arr.
            if(list[i].compareTo(arr[j]) < 0){
                // if elem i from list is "smaller" than the elem j from arr
                // add elem i to the newList
                newList[current] = list[i];
                i++;
            }else{
                //otherwise add elem j from arr.
                newList[current] = arr[j];
                j++;
            }
            current++;
        }

        while(i < count){
            // if there are more elem left from list
            // add them to the newList
            newList[current] = list[i];
            i++;
            current++;
        }

        while(j < arr.length){
            // if there are more elem left from arr
            // add them to the newList
            newList[current] = arr[j];
            j++;
            current++;
        }
        list = newList;
        count = current;
    }

    @Override
    //getting the object in the ix position of the list
    public E get(int ix) {
        return list[ix];
    }

    @Override
    // return the first index.
    public int firstIndex(E elem) {
        return bSearch(0, count-1, elem, false);

    }

    @Override
    public int lastIndex(E elem) {
       return bSearch(0, count-1, elem, true);
    }

    @Override
    //return true if we find elem in the list.
    public boolean contains(E elem) {
       return list[bSearch(0, count-1, elem, false)] == elem;
    }

    @Override
    public int countBetween(E lo, E hi) {
        int first = firstIndex(lo);
        int second = firstIndex(hi);
        if (first == second){
            second = lastIndex(hi);
            //due to it being inclusive: "The number of elements x such that lo <= x <= hi" we add +1
            return second - first + 1;
        }
        else return second - first;

    }


    @Override
    //returning the value of count which is the current list size
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
import java.util.LinkedList;

/**
 * Created by jpp on 10/02/16.
 */
public class SortedListLinkedListImpl<E> implements SortedList {

    public LinkedList<Comparable> list;

    public SortedListLinkedListImpl() {
        super();
        list = new LinkedList<Comparable>();
    }

    @Override
    public void add(Comparable elem) {
        if(list.isEmpty())
        {
            list.add(elem);
        }
        else {
            list.add(bSearchPlace(0, list.size()-1, elem), elem);
        }
    }

    public int bSearchPlace(int min, int max, Comparable elem)
    {
        int midpoint = min + ((max - min) / 2);

        if (min >= max) {
            int comp = elem.compareTo(list.get(min));
            if(comp < 0){// elem < min
                return min;
            }
            else if(comp > 0){ //elem > min
                return min+1;
            }
        }

        int comp = elem.compareTo(list.get(midpoint));
        if(comp < 0) {//element is smaller than midpoint
            return bSearchPlace(min, midpoint - 1, elem);//Search below the midpoint
        }
        else if(comp > 0) {// element is larger than midpoint
            return bSearchPlace(midpoint + 1, max, elem);//Search above the midpoint
        }
        else { // element is found
            return midpoint;
        }
    }

    @Override
    public void addSortedArray(Comparable[] arr) {

    }

    @Override
    public Comparable get(int ix) {
        return list.get(ix);
    }

    @Override
    public int firstIndex(Comparable elem) {
        return 0;
    }

    @Override
    public int lastIndex(Comparable elem) {
        return list.size();
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
        return list.size();
    }
}
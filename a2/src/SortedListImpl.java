import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by jpp on 10/02/16.
 */
public class SortedListImpl implements SortedList {

    LinkedList<Comparable> list;

    @Override
    public void add(Comparable elem) {
        if(list.isEmpty())
        {
            list.add(elem);
        }


    }

    @Override
    public void addSortedArray(Comparable[] arr) {

    }

    @Override
    public Comparable get(int ix) {
        return null;
    }

    @Override
    public int firstIndex(Comparable elem) {
        return 0;
    }

    @Override
    public int lastIndex(Comparable elem) {
        return 0;
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
        return 0;
    }
}

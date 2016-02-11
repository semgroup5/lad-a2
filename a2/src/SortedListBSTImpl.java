/*
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


  Created by jpp on 10/02/16.

public class SortedListBSTImpl<E extends Comparable> implements SortedList {

    class Node\E extends Comparable>{
        public E element;
        public Node<E> left;
        public Node<E> right;

        public Node(E element, Node<E> left, Node<E> right)
        {
            this.element = element;
            this.left    = left;
            this.right   = right;
        }
    }


    Node<Comparable>root;
    List<Node> list;

    public SortedListBSTImpl() {
        super();
        root = new Node<>(null, null, null);
    }

    @Override
    public void add(Comparable elem) {
        if(root.element == null)
        {
            root.element = elem;
        }
        else
        {
            list.add(bSearchPlace(0, list.size()-1, elem), elem);
        }
    }

    public int bSearchPlace(Node<Comparable> node, Comparable elem)
    {
        Node midpoint = node;

        int comp = elem.compareTo(root.element);
        if(comp < 0)
            bSearchPlace(node.left, elem);
        else if(comp > 0)
            bSearchPlace(node.right, elem);
        else
            return node;

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
            return ;//Search below the midpoint
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
    */
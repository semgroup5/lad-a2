/**
 * Created by jpp on 10/02/16.
 */
public class a2 {
    public static void main(String[] args)
    {
        SortedListImpl<String> sl = new SortedListImpl<String>();
        TestList.testList(sl);
        sl.list.clear();
        sl.add("Cd");
        printList(sl);
        sl.add("B");
        printList(sl);
        sl.add("Az");
        printList(sl);
        sl.add("Ad");
        printList(sl);
        sl.add("Bd");
        printList(sl);
        sl.add("Cd");
        printList(sl);
        sl.add("Xx");
        printList(sl);
    }

    public static void printList(SortedListImpl<String> sl)
    {
        System.out.println("");
        for (Comparable s:sl.list) {
            System.out.print(s + " ");
        }
    }
}

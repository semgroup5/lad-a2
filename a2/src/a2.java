/**
 * Created by jpp on 10/02/16.
 */
public class a2 {
    public static void main(String[] args)
    {
        SortedListImpl<String> sl = new SortedListImpl<>();
        TestList.testList(sl);

        sl.add("Cd");
        System.out.println(sl.toString());
        sl.add("B");
        System.out.println(sl.toString());
        sl.add("Az");
        System.out.println(sl.toString());
        sl.add("Ad");
        System.out.println(sl.toString());
        sl.add("Bd");
        System.out.println(sl.toString());
        sl.add("Cd");
        System.out.println(sl.toString());
        sl.add("Xx");
        System.out.println(sl.toString());
    }
}

public class TestList {
    
    public static void testList(SortedList<String> xs){
        
        if (xs.size() > 0) {
          System.out.println("Give me an empty list");
          return;
        }
        
        
//        xs.add("Cd");
//        xs.add("Ab");
//        xs.add("Cd");
//        String[] ss = {"Bc","De"};
//        xs.addSortedArray(ss);
//
//        System.out.println("Expected:\nAb Bc Cd Cd De ");
//        for (int i = 0; i < xs.size();i++)
//          System.out.print(xs.get(i) + " ");
//
//        System.out.println("\n\nExpected \n0 0 2 2 4 5 ");
//
//        System.out.print(xs.firstIndex("A")  + " ");
//        System.out.print(xs.firstIndex("Ab") + " ");
//        System.out.print(xs.firstIndex("C")  + " ");
//        System.out.print(xs.firstIndex("Cd") + " ");
//        System.out.print(xs.firstIndex("De")  + " ");
//        System.out.print(xs.firstIndex("E")  + " ");
//
//        System.out.println("\n\nExpected \n-1 0 1 3 4 4 ");
//        System.out.print(xs.lastIndex("A")  + " ");
//        System.out.print(xs.lastIndex("Ab") + " ");
//        System.out.print(xs.lastIndex("C")  + " ");
//        System.out.print(xs.lastIndex("Cd") + " ");
//        System.out.print(xs.lastIndex("De") + " ");
//        System.out.print(xs.lastIndex("E")  + " ");
//
//        System.out.println("\n\nExpected \n0 5 4 2 ");
//        System.out.print(xs.countBetween("A", "A")  + " ");
//        System.out.print(xs.countBetween("A", "E")  + " ");
//        System.out.print(xs.countBetween("Ab", "D")  + " ");
//        System.out.print(xs.countBetween("Cd", "Cd") + " ");
//
//        System.out.println("\n\nExpected \ntrue");
//        System.out.println(!xs.contains("A") && xs.contains("Ab"));

        String[] ss = {"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};
        xs.addSortedArray(ss);


        System.out.println("\n\nExpected \n0 " + (xs.size()-1));

        System.out.print(xs.firstIndex("A")  + " ");

        System.out.print(xs.lastIndex("A")  + " ");
        
    }
    
    
    
}





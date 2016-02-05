import java.util.LinkedList;

public class Node {
    public Node left;
    public Node right;
    public int element;
    
    public Node(Node l, int elem, Node r){
        element = elem;
        left = l;
        right = r;
    }
    
    /** 
     * Print all node elements in breadth first order, left to right on each level
     * A space separates every element from the next, a newline ends the sequence
     * @param n
     */
    public static void printBF(Node n){
        LinkedList<Node> s = new LinkedList<Node>();

        // Start with a list with the root node

        // Take the first node from the list and print its element
            
        // Add its child nodes to the end of the list in the correct order

        // Repeat from step 2 until all nodes have been processed
    }
    
    public static void main(String[] args){
        //level 3
        Node n6   = new Node(null, 6, null);
        
        //level 2
        Node n3   = new Node(null, 3, null);
        Node n4   = new Node(n6,   4, null);
        Node n5   = new Node(null, 5, null);
        
        //level 1
        Node n1   = new Node(n3, 1, n4  );
        Node n2   = new Node(n5, 2, null);
        
        //level 0
        Node root = new Node(n1,0,n2);
        
        System.out.println("Correct result:");
        System.out.println("0 1 2 3 4 5 6 ");
        
        System.out.println("Your result:");
        printBF(root);
    }   
}
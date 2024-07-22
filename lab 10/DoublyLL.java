public class DoublyLL {
    public static class Node {
        int info;
        Node right;
        Node left;

        Node(int data) {
            this.info=data;
            


        }
        
    }

    public static void display(Node first) {
        Node temp = first;
        while(temp!= null) {
            System.out.print(temp.info + " ");
            temp = temp.right;

        }
        System.out.println();
    }
    
    
    public static void displayRev(Node last) {
        Node temp = last;
        while(temp!= null) {
            System.out.print(temp.info + " ");
            temp = temp.left;

        }
        System.out.println();
    }
    public static void main(String[] args) {

        // creating a doubly linked list contains 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.left=null;
        a.right=b;
        b.left=a;
        b.right=c;
        c.left=b;
        c.right=d;
        d.left=c;
        d.right=e;
        e.left=d;
        e.right=null;
        display(a);
        displayRev(e);



        
    }
    
}

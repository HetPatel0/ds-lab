 class Node{
    int data;
    Node  next;

    Node(int data) {
        this.data=data;
        this.next = null;
    }
 }

  class LLStack{
    Node head = null;
   
    public void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head= temp;
     
    
    }
    public int pop(){
        if(head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }

    public int peek() {
        if ( head == null ){
            System.out.println("Stack is empty ");
            return -1;
        }
        return head.data;
        
    }

    public void displayRec(Node h) {
        if (h==null) {
            return;
        }
        displayRec(h.next);
        System.out.print(h.data+" ");
    }

    public void display() {
        displayRec(head);
        System.out.println();

    }

    public void displayRev() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            
        }
    }
   
 
    
 }

public class Q60 {
    public static void main(String[] args) {
        LLStack s = new LLStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        s.display();

    }
    
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data= data;
        next = null;
    }

}

class QueueLL {
    Node head = null ;
    Node tail = null ;
    int size=0;

    public void add(int x){
        Node temp = new Node(x);
        if (size ==0 ) {
            head = tail = temp;

        }
        else{
            tail.next= temp;
            tail=temp;

        }
        size ++;

    }
    public int peek() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public int remove() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data +  " ");
            temp = temp.next;
        }
    }
}

public class Q61 {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.display();

        
    }
    
}

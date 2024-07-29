class QueueArray{
    int f =-1;
    int r = -1;
    int n=20;
    int size=0;
    int arr[] = new int[n];
    public void enqueue(int x) {
        if(r>=n-1){
            System.out.println("overflow");
            return;
        }
        else if (f==-1) {
            f=r=0;
            arr[0]=x;
        }
        else{
            r++;
            arr[r]=x;
        }
        size++;

    }

    public int dequeue() {
        if(f==-1) {
            System.out.println("underflow");
        }
        int x = arr[f];
        if(f==r){
            f=r=0;

        }
        f++;
        size--;
        return(x);
    }

    public void display() {
        for(int i=f;i<=r;i++){
            System.out.println(arr[i]);
            
        }
    }
}

public class Q50 {
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(2);
        
        q.display();
    }
    
}

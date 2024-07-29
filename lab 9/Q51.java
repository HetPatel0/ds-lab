class cQueue{
    int f=-1;
    int r=-1;
     int  size = 0;
    int n=20;
    int [] arr = new int[n];
    public  void add(int x) {
        if ( size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        if (size == 0 ) {
            f=r=0;
            arr[0]= x;

        }
        else if(r< arr.length-1) {
            arr[++r] = x;

        }
        else if (r== arr.length) {
            r=0;
            arr[0]=x;
        }
        size++;
    }

    public int remove() throws Exception{
        if (size==0) {
            throw new Exception("Queue is empty");
        }
        else {
            int val = arr[f];
            if(f== arr.length-1) {
                f=0;
            }
            else  f++;
            size--;
            return val;
        }

    }

    public void display() {
        if ( size == 0 ) {
            System.out.println("Queue is empty");
            return;
        }
        else {
            if(f<=r){
                for(int i=f;i<=r;i++ ){
                    System.out.print(arr[i] + " ");

                }
                System.out.println();

            }
            else {// rear smaller than front
                for(int i=f;i<arr.length;i++ ){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0;i<=r;i++) {
                    System.out.println(arr[i]+ " ");
                }
                System.out.println();


            }
        }
    }
}

public class Q51 {
    public static void main(String[] args) throws Exception {
        cQueue q = new cQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();



    }
}



public class Q99 {
    public static void main(String[] args) {
        int[] a={80,93,60,12,42,30,68,85,10};
        shellShort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }

    }
    static  void  shellShort(int[] a)  {
        int n = a.length;
       for (int gap=(n/2)-1;gap>=1;gap-=gap/2 ) {
        for (int j= gap;j<n;j++) {
            for(int i= j-gap;i>=0;i-=gap) {
                if(a[i+gap]>a[j]) {
                    break;
            }
            else{
                swap(a,i+gap,j);
            }
        }
        
    }   
} 
}
static  void  swap(int[] a,int i,int j)
 {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
 }
 }

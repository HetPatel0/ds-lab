
public class Q93 {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int[] a = {32,23,44,33,22,44,55,12};
    int i=1;
    while(i<a.length){
        int j=i-1;
        int key = a[i];
        while (j>=0 && a[j]>key) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1]=key;
        i++;
    }
    printArray(a);
  }  
}

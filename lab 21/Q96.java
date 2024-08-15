public class Q96 {
    public static void conquer(int arr[],int si,int mid, int ei){
        int merged[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int x =0;
        while (i<= mid && j<= ei)  {
            if(arr[i] <= arr[j]) {
                merged[x]=arr[i];
                x++;
                i++;
            }
            else{
                merged[x]=arr[j];
                x++;
                j++;
            }
            
        }
        while (i<=mid) {
            merged[x]=arr[i];
            x++;
            i++;
            
        }
        while (j<=ei) {
            merged[x]=arr[j];
            x++;
            j++;
            
        }
        for(int i1=0,j1=si;i1<merged.length;i1++,j1++) {
            arr[j1] = merged[i1];

        }
    }
    public static void divide(int arr[],int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei-si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);

        // display
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

import java.util.Scanner;

/**
 * Q21
 */
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n+1];
        System.out.println("Enter array");

        for(int i=0 ;i<arr1.length;i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Insert index");
        int insertIdx = sc.nextInt();
        System.out.println("Enter number to be inserted ");
        int insertNo = sc.nextInt();

        for (int i=0;i<arr2.length;i++){
            if (i<insertIdx) {
                arr2[i] =arr1[i];
            }
            else if(i==insertIdx){
                arr2[i]=insertNo;

            }
            else if (i> insertIdx) {
                arr2[i]= arr1[i-1];
            }
        }

        System.out.println("result : ");

        for (int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]);
        }

    
    }
    
}

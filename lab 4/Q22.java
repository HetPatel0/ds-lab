import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array");

        for(int i=0 ;i<a.length;i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Index to be removed");
        int remove = sc.nextInt();
        for(int i=remove;i<n;i++) {
            a[i] = a[i+1];
            n--;
        }

        for(int i=0;i<a.length-1;i++) {
            System.out.print(a[i] + ",");
        }

    }
}

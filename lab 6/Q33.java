import java.util.Scanner;

public class Q33{
   public static void swap(int a, int b) {
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+ " "+ b);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        swap(a, b);

       
    }
    
}

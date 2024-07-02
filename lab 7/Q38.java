
import java.util.Scanner;

 class MyStack{
    Scanner sc = new Scanner(System.in);
    
    int n ;
    int[] a ;
    int top = -1;
    public MyStack(int n ) {
        this.n=n;
        a = new int[n];
    }
    public void fnpush(int x) {
        
         if(top>=n-1){
            System.out.println("Stack Overflow");
         }
         else{
            top++;
            a[top]=x;
         }


    }
    public int fnpop(){
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;

        }
        else{
            top--;
            return a[top];
        }

    }

    public void  fndisplay() {
        for ( int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }

    public int fnpeep(int i) {
      
        if (top-i<0) {
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            return a[top-i];
        }
    }
    public void fnchange(int i,int x) {
        
        if (top-i <=0) {
            System.out.println("stack is underflow");
        }
        else{
            a[top-i]= x;

        }
    }


    
    
}

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size = sc.nextInt();
        MyStack stack = new MyStack(size);

        int choice;
        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep (View element at index)");
            System.out.println("5. Change (Modify element at index)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.fnpush(element);
                    break;
                case 2:
                    int poppedValue = stack.fnpop();
                    if (poppedValue != -1) {
                        System.out.println("Popped element: " + poppedValue);
                    }
                    break;
                case 3:
                    stack.fndisplay();
                    break;
                case 4:
                    System.out.print("Enter index to view (0-based): ");
                    int index = sc.nextInt();
                    int peekedValue = stack.fnpeep(index);
                    if (peekedValue != -1) {
                        System.out.println("Element at index " + index + ": " + peekedValue);
                    }
                    break;
                case 5:
                    System.out.print("Enter index to change (0-based): ");
                    int changeIndex = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();
                    stack.fnchange(changeIndex, newValue);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 0 and 5.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}

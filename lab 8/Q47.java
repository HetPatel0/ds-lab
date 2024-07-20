import java.util.Scanner;
import java.util.Stack;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression");
        String str = sc.next();
        Stack<Integer> val = new Stack<>();
        for(int i =0; i<str.length();i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ascii-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if (str.charAt(i)=='+') val.push(v1+v2);
                if (str.charAt(i)=='-') val.push(v1-v2);
                if (str.charAt(i)=='*') val.push(v1*v2);
                if (str.charAt(i)=='/') val.push(v1/v2);

            }
        }
        System.out.println(val.peek());
    }
}

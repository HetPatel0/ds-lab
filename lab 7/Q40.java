
import java.util.Scanner;
import java.util.Stack;

public class Q40 {

    static  int i=-1;
        public static  char nextChar(String s) {
           if (i== s.length()) {
            return ' ';
           }
             i++;
            return s.charAt(i);
        }
    public static void main(String[] args) {
        Stack <Character> s1 = new Stack<>();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        char next = nextChar(s);
        s1.push(next);
        int count_a =0;
        int count_b = 0;
        while(next != ' '){
      
            if (next == 'a'){
                s1.push(next);
                count_a++;
                next= nextChar(s);
            }
            else{
                count_b++;
                s1.push(next);
                next= nextChar(s);

            }
        }
        if (count_a == count_b) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
        
    }
    
}

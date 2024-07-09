
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
        Stack <Character> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        char next = nextChar(s);
        s1.push(next);
        int counts1 =1;
        int counts2 = 0;
        while(next != ' '){
            next = nextChar(s);
            if (next == s1.peek()){
                
            }
        }
        
    }
    
}

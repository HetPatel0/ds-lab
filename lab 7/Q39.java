
import java.util.Scanner;
import java.util.Stack;

public class Q39 {
     static  int i=-1;
        public static  char nextChar(String s) {
           
             i++;
            return s.charAt(i);
        }

        public static void main(String[] args) {
            Stack <Character> s = new Stack<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            String s1 = sc.nextLine();
            s.push('c');
            char next = nextChar(s1);
            while(next!= 'c') {
                if (next == ' ') {
                    System.out.println("Not valid");
                }
                else{
                    s.push(next);
                    next = nextChar(s1);
                }
            }

            while(s.peek()!= 'c'){
                next=nextChar(s1);
                char x = s.pop();
                if (next != x) {
                    System.out.println("invalid String");
                }
            }
            if(i== s1.length()-1){
                System.out.println("Invalid String");
            }
            else{
                next = nextChar(s1);
              
          
            if(next == ' '){
                System.out.println("Valid string");
            }
            else {
                System.out.println("Not a vlaid string");
            }


            }
 
                

            
        }
    }
    

import java.util.Scanner;
import java.util.Stack;

class InfixToPrefix{
    public int getPrecedence(char ch) {
        switch (ch) {
            case '^':
                return 3;

            case '*':
            case '/':
                return 2;

            case '+':
            case '-':
                return 1;
        }
        return -1;
    }

    public void convert(String infix){

        Stack<Character> newS = new Stack<>();
        for(int i=0;i<infix.length();i++) {
            char next = infix.charAt(i);
            if(next==')'){
                newS.push('(');
            }
            else if(next=='('){
                newS.push(')');

            }
            else{
                newS.push(infix.charAt(i));
            }

        }

            StringBuffer s= new StringBuffer();
        for (int i=0;i<infix.length();i++){
            s.append(newS.pop());
        }

        Stack<Character> stacky = new Stack<>();
        StringBuffer result = new StringBuffer();
      //  stacky.push('(');

        for(int i=0;i<s.length();i++) {
           char next = s.charAt(i);


            if(( next >= 'a' && next <= 'z') || (next >= 'A' && next <= 'Z')){
                result.append(next);

            }
           else if(stacky==null) {
                stacky.push(next);
            }
           else if(getPrecedence(next)<getPrecedence(stacky.peek())){
               result.append(stacky.pop());
               stacky.push(next);
            }

           else if (next==')') {
               while (!stacky.isEmpty()){
                   result.append(stacky.pop());


               }


            }

        }
        result= result.reverse();
        System.out.println(result);





    }

}


public class Q46 {
    public static void main(String[] args) {
        InfixToPrefix c = new InfixToPrefix();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        c.convert(s);
    }


}

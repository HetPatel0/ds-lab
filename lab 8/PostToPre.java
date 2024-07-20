import java.util.Scanner;
import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression");
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ch+"");
            }
            else{
                String v2 = val.pop();
                String v1= val.pop();
                char op = ch;
                // in postfix  to prefix it is "op v2 v1 op"
                String t =  v2 + v1 + op;
                val.push(t);
            }
        }
        String ans = val.pop();
        StringBuffer fin = new StringBuffer();
        fin.append(ans);
        fin = fin.reverse();
        System.out.println(fin);

       
    
    }
}

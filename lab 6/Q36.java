import java.util.Scanner;

class Conversion {
    double fer;
    double cel;
    Scanner sc = new Scanner(System.in);
    void cTof() {
        cel = sc.nextDouble();
        fer =((9/5.0)*cel)+32;
        System.out.println(fer);

    }

    void fToc() {
        fer = sc.nextDouble();
        cel =(fer-32)*(5/9.0);
        System.out.println(cel);

    }
}

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion c = new Conversion();
        System.out.println("Enter c or f");
         String s = sc.next();
         char ch = s.charAt(0);
         if ( ch == 'c'){
            c.cTof();
         }
         if (ch== 'f') {
            c.fToc();
         }

     
    }
    
}

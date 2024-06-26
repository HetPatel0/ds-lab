import java.util.Scanner;

class Student {
    int enrollementNo;
    String name;
    int sem;
    double cpi;
    Scanner sc = new Scanner(System.in);

    void getdetails(){
        System.out.println("Enter Details");
        enrollementNo = sc.nextInt();
        name = sc.next();
        sem = sc.nextInt();
        cpi = sc.nextDouble();
    }

    void printdetails() {
        System.out.println(enrollementNo);
        System.out.println(name);
        System.out.println(sem);
        System.out.println(cpi);
    }
}

public class Q35 {
    public static void main(String[] args) {

        Student[] s = new Student[5];
       
        for (int i=0;i<5;i++) {
           s[i] = new Student();
            s[i].getdetails();
        }
        for (int i=0;i<5;i++) {
            s[i].printdetails();
        }


        
    }
    
}

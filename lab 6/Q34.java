import java.util.Scanner;

class Empolyee {
    Scanner sc = new Scanner(System.in);
    int empolyee_ID;
    String name;
    String designation;
    int salary;

    void getdetails() {
        System.out.println("Enter your details");
        empolyee_ID = sc.nextInt();
        name = sc.next();
        designation = sc.next();
        salary = sc.nextInt();

    }

    void printdetails() {
        System.out.println(empolyee_ID);
        System.out.println(name);
        System.out.println(designation);
        System.out.println(salary);
    }
}

public class Q34 {
    public static void main(String[] args) {
        Empolyee e1 = new Empolyee();
        e1.getdetails();
        e1.printdetails();
    
        
    }
    
}

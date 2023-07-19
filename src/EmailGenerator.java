import java.lang.*;
import java.util.*;

public class EmailGenerator {
     static String cmpName="Capgemini" ;
    public static void main(String[] args) {
        System.out.println("Welcome to the Email Generator ");
        System.out.print("May I know your Firstname please: ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();
        System.out.print("Thank, now May I know your Last name: ");
        String lName = sc.next();
        Email u1 = new Email(fName,lName);
    }
}

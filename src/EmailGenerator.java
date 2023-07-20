import java.lang.*;
import java.util.*;

public class EmailGenerator {
     static String cmpName="Capgemini" ;
    public static void main(String[] args) {
        System.out.println("Welcome to the Email Generator ");
        check();

    }
    static void check(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Email> arr = new ArrayList<>();
        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();

        System.out.print("Enter the number of employee's data you want to Generate: ");
        if(sc.hasNextInt()){
            int num = sc.nextInt();

            for(int i=0;i<num;i++) {
                    System.out.print("Enter your Firstname,press x to terminate: ");
                    String fName = sc.next();
                    if (fName.equals("x") || fName.equals("X")){
                        break;
                    }
                    firstname.add(fName);
                    System.out.print("Enter your Last name: ");
                    String lName = sc.next();
                    lastname.add(lName);
                    arr.add(new Email(fName, lName));


            }
            for (int i = 0; i <arr.size(); i++) {
                System.out.println("Your Email is: "+Email.arrEmailId.get(i)+
                        "\nYour Password is: "+ Email.arrPassword.get(i));
            }
        }else {
            System.out.println("please provide valid input: ");
            check();
        }
    }
}

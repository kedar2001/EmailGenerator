import java.util.ArrayList;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int passwordCapacity = 8;
    private int mailBoxCapacity;
    private String alternateEmail;
    static ArrayList<String> arrEmailId = new ArrayList<>();
    static ArrayList<String> arrPassword = new ArrayList<>();

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("Welcome"+", "+ this.firstName +" "+ this.lastName + "\nchoose your Department\n");

        this.department=setDepartment();
        System.out.println("\nAwesome, You belongs to "+department+" Department\n");

        this.password = setPassword(passwordCapacity);

        this.email = this.firstName.toLowerCase().trim()+
                    "."+this.lastName.toLowerCase().trim() +
                    "@"+this.department.toLowerCase().trim()+
                    "."+EmailGenerator.cmpName+
                    ".com";
        arrEmailId.add(this.email);
        arrPassword.add(this.password);
        //System.out.println("Your Email is: "+this.email);
        //System.out.println("Your password is: "+ this.password);
    }

    private static String setDepartment(){
        System.out.print("Here are the department code: \n1)Sales \n2)Developer \n3)Accountant " +
                "\nENTER CODE HERE: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int codeInput = sc.nextInt();
            String s = null;
            if (codeInput == 1) {
                return "Sales";
            } else if (codeInput == 2) {
                return "Developer";
            } else if (codeInput == 3) {
                return "Accountant";
            } else {
                System.out.println("No match found Retry \n \n");
                return setDepartment();
            }
        }
        else {
            return setDepartment();
        }
    }

    private static String setPassword(int lengthh){
        String poss = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#";
        char[] posOut = new char[lengthh];
        for(int i = 0;i<lengthh;i++){
            int rand = (int)(Math.random() * poss.length());
            posOut[i] = poss.charAt(rand);
        }
        return new String(posOut);
    }
}


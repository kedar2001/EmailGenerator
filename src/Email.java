import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String email;
    private int passwordCapacity = 8;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("Welcome"+", "+ this.firstName +" "+ this.lastName + "\nchoose your Department\n");

        this.department=setDepartment();
        System.out.println("\n\nAwesome, You belongs to "+department+" Department");

        this.password = setPassword(passwordCapacity);

        this.email = this.firstName.toLowerCase().trim()+
                    "."+this.lastName.toLowerCase().trim() +
                    "@"+this.department.toLowerCase().trim()+
                    "."+EmailGenerator.cmpName+
                    ".com";
        System.out.println("Your Email is: "+this.email);
        System.out.println("Your password is: "+ this.password);
    }

    private static String setDepartment(){
        System.out.print("Here are the department code: \n1)Sales \n2)Developer \n3)Accountant " +
                "\nENTER CODE HERE: ");
        Scanner sc = new Scanner(System.in);
        int codeInput = sc.nextInt();
        String s=null;
        if(codeInput == 1){
            return "Sales";
        } else if (codeInput ==2) {
            return "Developer";
        } else if (codeInput==3) {
            return "Accountant";
        }else {
            System.out.println("No match found Retry \n \n");
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


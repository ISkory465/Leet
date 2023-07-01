import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args) {
        System.out.println("Main.");
        // AND_Operator();
        // OR_Operator();
        NOT_Operator();
    }

    public static void AND_Operator() {
        System.out.println("Test output.");

        // && - AND Operator
        int temp = 18;
        if (temp >=35){
            System.out.println("It is hot todat");
        }
        else if (temp>=20 && temp <35){
            System.out.println("The temperature is okay!");
        }
        else {
            System.out.println("It is cold outside");
        }

    }

    public static void OR_Operator() {
        
        // || - OR Operator
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        if(name.equals("Iurii") || name.equals("IURII")) {
            System.out.println("You have administartive rights in this system.");
        }
        else {
            System.out.println("You don't access to the system OR the user name is wrong.");
        }

        scanner.close();
    }

    public static void NOT_Operator() {
        
        // ! - NOT Operator

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        if(!name.equals("Iurii")) {
            System.out.println("You don't access to the system OR the user name is wrong.");

        }
        else {
            System.out.println("You have administartive rights in this system.");
        }

        scanner.close();

    }
}

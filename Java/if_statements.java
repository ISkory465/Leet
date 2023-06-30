import java.util.Scanner;

public class if_statements {
    public static void main(String[] args) {
        System.out.println("Main is running...");
        Example1();
    }

    public static void Example1() {
        System.out.println("Example1 is executed!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        if (age < 18) {
            System.out.println("You are not allowed to drink alcohol!");
        }
        else if (age >= 18) {
            System.out.println("Good to go!");
        }

        // System.out.printf("Your age is %d. \n", age);

        scanner.close();
    }
}

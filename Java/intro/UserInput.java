package intro;
import java.text.Format;
import java.util.Scanner;


public class UserInput {
    
    public static void main(String[] args) {
        System.out.println("Main is running");
        // Example1();
        Example2();
    }

    public static void Example1() {
        Scanner scanner = new Scanner(System.in);


        // print doesn not have '\n' in the and compared to the println
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();

        // System.out.println(String.format("Your name is %s", name));
        // printf replicates String.format
        System.out.printf("Your name is %s", name);

        scanner.close();
    }

    public static void Example2() {
        Scanner scanner = new Scanner(System.in); // also can be used to read from files
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("What is yor age %s? ", name);
        // Scanner parameter for the int
        // for double .nextDouble() or String
        int age = scanner.nextInt();

        //Or ew can use another input for the integer
        // int age = Integer.parseInt(scanner.nextLine());
        // double gpa = Double.parseDouble(scanner.nextLine());

        // clean input buffer
        scanner.nextLine();

        System.out.printf("The %d years is the perfect age to learn Java. \n", age);
        // System.out.printf("You have a nice %s gpa, keep it up!. \n", gpa);

        // This .nextline() does not work properly because ofthe <enter> from the .nextInt() is ommited 
        System.out.print("What programming laguage do you learn right now?: ");
        String language = scanner.nextLine();

        System.out.printf("%s is cool.\n", language);



        scanner.close();
    
    }
    
    
}

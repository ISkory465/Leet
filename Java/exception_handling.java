import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling{
    public static void main(String[] args) {
        System.out.println("\nExceptions:\n\n");
        Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("ENter a whole number to divide:");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ENter a whole number to divide by:");
        int y = scanner.nextInt();
        scanner.nextLine();

        double z = x/y;

       System.out.printf("Result of diviosion %d by %d is: %5.2f\n\n", x ,y ,z);

    } catch(ArithmeticException e) {
        System.out.println("Can NOT divide by ZERO!");
    } catch(InputMismatchException e) {
        System.out.println("NO strings allowed, ONLY numbers");
    } catch(Exception e) {
        System.out.println("Somethinf went wrong.");
    }finally {
        System.out.println("Final block execution");
        scanner.close();
    }

    }
}
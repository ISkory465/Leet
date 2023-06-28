import java.util.Scanner;

public class Math_library {
    public static void main(String[] args) {
        System.out.println("Main is running...");
        // Example1();
        Hypothenys();
    }


    public static void Example1() {
        System.out.println("Example1 is running..");


        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        // double z = Math.min(x, y);
        // double z = Math.abs(y);
        // double z = Math.sqrt(x); returns NaN when negative value; maybe there is some  other function for the complex number
        // double z = Math.round(x);
        // double z = Math.ceil(3.14); >> 4.0
        // double z = Math.floor(3.14);>> 3.0

        System.out.println(z);
    }

    public static void Hypothenys() {
        
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the x value: ");
        x = scanner.nextDouble();
        // scanner.nextLine();


        System.out.print("ENter the y value: ");
        y = scanner.nextDouble();
        // scanner.nextLine();


        z = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
        System.out.printf("The result is %f:  \n", z);

        scanner.close();
    }
}

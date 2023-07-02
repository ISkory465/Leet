import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        System.out.println("Main is here.");
        // Loop();
        Do_loop();
    }

    public static void Loop() {
        System.out.println("Code execution");

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Basic while loop
        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.printf("Hi, %s! \n", name);
    }

    static void Do_loop() {
        System.out.println("Code execution");

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Always execute the code at least once and then will check for a "while-condition"
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.printf("Hi, %s! \n", name);
    }
}

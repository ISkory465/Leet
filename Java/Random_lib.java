import java.util.Random;

public class Random_lib {
    public static void main(String[] args) {
        System.out.println("Main is running...");
        Example1();
    }

    public static void Example1() {
        System.out.println("Example1 is running...");
        
        // generates pseudorandom values
        Random random = new Random();

        // int x = random.nextInt(6)+1;
        // double y = random.nextDouble(); //gives number between 0 and 1
        boolean z = random.nextBoolean();

        System.out.printf("This value is: %b \n", z);
    }
}

public class Operators {
    public static void main(String[] args) {
        System.out.println("Hello");

        int number1 = 12;
        int number2 = 5;

        // addition
        System.out.println(number1 + number2); // 17
        
        // substraction
        System.out.println(number1 - number2); // 7

        // multiplication
        System.out.println(number1 * number2); // 60

        // division of integers give an integer with rounding down
        System.out.println(number1 / number2); // 2

        // division to recieve float, one of the numbers should be double
        double dNumber1 = number1;
        System.out.println(dNumber1 / number2); // 2.4

        // or use this
        System.out.println((double)number1 / number2); // 2.4

        // remainder (modulo / modulus)
        System.out.println(number1 % number2); // 2
    }
}

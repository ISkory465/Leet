public class Operators {
    public static void main(String[] args) {
        System.out.println("Hello");
        // BasicMath();
        // RelationalOperator();
        LogicOperator();
    }

    private static void BasicMath() {
        
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

    private static void RelationalOperator() {
        int a = 10;
        int b = 5;
        boolean isEqual = (a == b);      // Equality
        boolean isNotEqual = (a != b);   // Not Equal
        boolean isGreaterThan = (a > b); // Greater Than
        boolean isLessThan = (a < b);    // Less Than
        boolean isGreaterOrEqual = (a >= b);  // Greater Than or Equal To
        boolean isLessOrEqual = (a <= b);     // Less Than or Equal To
        
        System.out.println("Check if two number are equal: " + isEqual);

    }

    private static void LogicOperator() {
        boolean x = true;
        boolean y = false;
        boolean result1 = x && y;   // Logical AND
        boolean result2 = x || y;   // Logical OR
        boolean result3 = !x;       // Logical NOT


        System.out.println("AND operator check: " + result1 + " | OR: " + result2 + " | NOT: " + result3);
    }
}

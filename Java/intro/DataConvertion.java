package intro;
public class DataConvertion {
    
    public static void main(String[] args) {
        
        // example1: easy convertion from a smaller int to a larger double, won't work vice versa
        int intNumber = 5;
        double dNumber = intNumber;

        //example of convertion of a larger (double) number into smaller int
        double number1 = 5.8;
        int number2 = (int)number1;


        System.out.println("Example of the double: " + dNumber + " and variable has such datatype: " + Double.TYPE.getSimpleName());
        System.out.println("Example of the integer: " + number2);
    }
}

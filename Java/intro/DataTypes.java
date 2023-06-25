package intro;
public class DataTypes {
    public static void main(String[] args) {
        Examples();      
    }

    public static void Examples() {
        // integer types
        byte aSingleByte = 100; //-128 to 127
        short aSmallNumber = 20000; // -32.768 to 32.767
        int anInteger = 2147483647;
        long aLargeNumber = 922337283685477587L;


        // decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

        // booleans
        boolean isWeekend = true;
        boolean isWorkday = false;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is a copyright symbol: " + copyrightSymbol);
    }
}

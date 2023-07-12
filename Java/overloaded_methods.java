public class overloaded_methods {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        double x = 3.14;
        double y = 7.3;
        double z = 6.22;

        System.out.println("Result: "+ add(y,z));

    }


    // int
    static int add(int a, int b) {
        System.out.println("this is overloiaded method #1");
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.println("this is overloiaded method #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("this is overloiaded method #3");
        return a+b+c+d;
    }

    
    // double
    static double add(double a, double b) {
        System.out.println("this is overloiaded method #4");
        return a+b;
    }

    static double add(double a, double b, double c) {
        System.out.println("this is overloiaded method #5");
        return a+b+c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("this is overloiaded method #6");
        return a+b+c+d;
    }
}

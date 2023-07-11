public class methods {
    public static void main(String[] args) {
        System.out.println("Hi!");

        String name = "Iurii";
        int age = 31;
        // hello(name, age);

        int x = 3;
        int y = 4;
        System.out.printf("Sum operation result: %d\n", sum(x, y));
    }

    static void hello(String personName, int personAge) {
        System.out.printf("Hello, %s!\nYour age is %d.\n", personName, personAge);
    }

    static int sum(int num1, int num2) {
        int result = num1 + num2;
        // return result;
        return num1 + num2;
    }
}

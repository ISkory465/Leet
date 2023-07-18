package OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello.");


        car car1 = new car();
        // car1.go();
        // car1.stop();

        bicycle byc1 = new bicycle();
        // byc1.go();
        // byc1.stop();

        System.out.println(car1.wheels);
        System.out.println(byc1.wheels  );
    }
}

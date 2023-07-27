package OOP.polymorphism_exmpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main:\n-----------------\n\n");
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car,boat, bicycle};

        for (Vehicle obj: racers) {
            obj.go();
            System.out.println();
        }
    }
}

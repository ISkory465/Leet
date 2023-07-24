package OOP.Encapulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello there! \nGeneral Kenobi\n");

        Car car = new Car("BMW", "540d", 2023);

        car.setMake("Bayerische Motoren Werke");
        car.setModel("540d xDrive");
        car.setYear(2022);

        System.out.println(car);
    }
}

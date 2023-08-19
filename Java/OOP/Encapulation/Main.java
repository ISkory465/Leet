package OOP.Encapulation;

import OOP.access_modiifiers.package2.C;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello there! \nGeneral Kenobi\n");

        Car car = new Car("BMW", "540d", 2023);
        // Car car2 = new Car("BMW", "M550i",2023);

        // car.setMake("Bayerische Motoren Werke");
        // car.setModel("540d xDrive");
        // car.setYear(2022);

        // car2.copy(car);

        Car car2 = new Car(car);

        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();    
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println(car2.getMake());
        System.out.println();

        //toString for the object -> __str__ in python
        System.out.println(car);
        System.out.println(car2);
    }
}

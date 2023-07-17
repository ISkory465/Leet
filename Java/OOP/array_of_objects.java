package OOP;

import java.util.ArrayList;

public class array_of_objects {
    public static void main(String[] args) {
        System.out.println("Main");

        var garage = new ArrayList<>();

        Ferrari car1 = new Ferrari("812 GTS", "Rosso Red", 2022);

        Ferrari car2 = new Ferrari("296 GTS", "SIlver Metalic", 2023);

        Ferrari car3 = new Ferrari("Roma", "Black Metalic", 2023);

        garage.add(car1);
        garage.add(car2);
        garage.add(car3);

        for (Object auto: garage) {
            System.out.println(auto);
        }

    }
}

import java.util.ArrayList;

public class Training {
    public static void main(String[] args) {
        Ferrari();
    }


    static void Ferrari() {

        ArrayList<String> ferrari = new ArrayList<>(3);

        ferrari.add("Portofino");
        ferrari.add("F8");

        for (String car: ferrari) {
            System.out.println(car);
        }

    }
}



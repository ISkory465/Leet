public class twoD_arrays {
    public static void main(String[] args) {
        System.out.println("Main");
        towD();
    }
    
    private static void towD() {

        // 1st approach for init
        String[][] cars = new String[3][3];

        cars[0][0] = "BMW";
        cars[0][1] = "Volkswagen";
        cars[0][2] = "Mercedes-Benz";

        cars[1][0] = "Mazda";
        cars[1][1] = "Toyota";
        cars[1][2] = "Nissan";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Fiat";
        cars[2][2] = "Lamborghini";

        // 2nd array for init
        String[][] cars2 = {{"BMW", "Volkswagen", "Mercedes-Benz"},
                            {"Mazda", "Toyota", "Nissan"}, 
                            {"Ferrari", "Fiat", "Lamborghini"}};

        for (int i=0; i<cars.length; i++) {
            for (int j=0; j<cars[i].length; j++) {
                System.out.printf("Car manufacturer -> | %s |\n", cars[i][j]);
            }
        }

    }
}

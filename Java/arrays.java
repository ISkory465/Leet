public class arrays {
    public static void main(String[] args) {
        System.out.println("Main.");


        // One of the possibilities of creatinf an string array
        // Should contain only one datatype -> in this case String; in Python it can be whatever
        String[] names = {"Mykola", "Valera", "Grogoriy"};

        names[0] = "Petro";
        // System.out.println(names[3]);


        //Another way of creating the array
        String[] cars = new String[5];

        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Mercedes-Benz";
        cars[3] = "Volkswagen";
        cars[4] = "Mazda";

        System.out.println(cars[4]);

        //check the max length of the element in the array

        int maxNameLength = 0;

        for (String str: cars) {
            if (str.length() > maxNameLength) {
                maxNameLength = str.length();
            }
        }

        for (int i=1; i <= cars.length; i++) {

            int carNameLenght = cars[i-1].length();
            String printOutput = " ".repeat(maxNameLength-carNameLenght+1);
            printOutput += cars[i-1];

            System.out.printf("Automanufacturer #%d:%s \n", i, printOutput);
        }
    }

  
}

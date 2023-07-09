import java.util.ArrayList;

public class ArrayList_example {
    public static void main(String[] args) {
        System.out.println("Main check.");
        ArrayExample();
    }

    public static void ArrayExample() {

        // Can only store reference datatypes
        ArrayList<String> food = new ArrayList<>(); 
        
        food.add("Pizza");
        food.add("Hamburger");        
        food.add("Pasta");

        food.set(0, "Wok");
        food.add(1, "Sushi");
        food.remove("Wok");
        // food.clear(); // deletes (clears) all the elements from the array

        for (String str: food) {
            System.out.printf("Food index %d| Object stored: %s\n", food.indexOf(str), str);
        }

    }
}

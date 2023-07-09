import java.util.*;


public class twoD_ArrayList {
    public static void main(String[] args) {
        System.out.println("Valera is here.");
        Example();
    }

    private static void Example() {
        // dynamic list of lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("Bread");
        bakeryList.add("Bun");
        bakeryList.add("Garlic Bread");
                
        // System.out.println(bakeryList.get(1));


        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("Tomatos");
        produceList.add("Peppers");
        produceList.add("Zucchini");
        produceList.add("Pesto");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("Pepsi");
        drinksList.add("Wine");

        // System.out.println(drinksList);

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(1));
        }
}

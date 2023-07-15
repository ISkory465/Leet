package OOP;

public class car {

    private String make; 
    private String model; 
    private int year;
    private String color;
    private double price;
    
    public car(String make, String model, int year, String color, double price) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    
    public void drive() {
        System.out.printf("\nYou drive %s %s %s\n", this.color, this.make, this.model);
    }

    public void brake() {
        System.out.printf("\nYou hit a brake, Your %s is too fast!\n\n", this.make);
    }
}

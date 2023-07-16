package OOP;

public class Ferrari {
    
    private String model;
    private String color;
    private int year;
    private double price;
    
    public Ferrari(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    
    public Ferrari(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }



    public String toString() {
        return String.format("\nFerrari %-10s\n color: %10s\n year:  %-10d\n price: %,-10.2f\n", model, color, year, price);
    }

}

package OOP.Encapulation;

public class Car {
    
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car obj) {
        this.copy(obj);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car obj) {
        this.setMake(obj.getMake());
        this.setModel(obj.getModel());
        this.setYear(obj.getYear());
    }


    // public String toString() {
    //     return String.format("The %s %s made in %d", make , model, year);
    // }
}

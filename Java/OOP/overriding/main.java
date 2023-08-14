package OOP.overriding;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Dog dog = new Dog();
        Animal animal = new Animal();

        dog.speak();
        animal.speak();
    }
}

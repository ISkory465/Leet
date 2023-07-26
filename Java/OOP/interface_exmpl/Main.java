package OOP.interface_exmpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is being executed.");

        Rabbit rabbit = new Rabbit();

        // rabbit.flee();

        Hawk hawk = new Hawk();

        // hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

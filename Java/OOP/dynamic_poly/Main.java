package OOP.dynamic_poly;

import java.util.Scanner;

import OOP.access_modiifiers.package1.A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Setting polymorphism after the compilation");

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What type of animal do you want?");
        System.out.print("1 = Dog   2 = Cat: ");

        int animalType = scanner.nextInt();

        if (animalType == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (animalType == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Wrong data as input.");
            animal.speak();
        }

        
    }
}

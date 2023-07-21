package OOP.super_exmpl;

public class Person {
    String name;
    int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("The %s is %d years old.", name, age);
    }
}

package OOP.super_exmpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main");

        Hero hero1 = new Hero("Batman", 27, "$$$");
        Hero hero2 = new Hero("Flash", 19, "Speed");

        System.out.println(hero1);
        System.out.println(hero2);
    }
}

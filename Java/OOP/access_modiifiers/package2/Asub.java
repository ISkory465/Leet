package OOP.access_modiifiers.package2;
import OOP.access_modiifiers.package1.A;


public class Asub extends A {
    // public static void main(String[] args) {
    //     C c = new C();
    //     System.out.println(c.defaultMessage);
    // }

    
    public static void main(String[] args) {
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
    
}

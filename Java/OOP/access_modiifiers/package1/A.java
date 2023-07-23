package OOP.access_modiifiers.package1;
import OOP.access_modiifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }

    protected String protectedMessage = "This is protected";
    // public static void main(String[] args) {
        // B b = new B();
        // System.out.println(b.privateMessage);
    // }
}

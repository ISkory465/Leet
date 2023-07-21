package OOP.super_exmpl;

public class Hero extends Person {
    String power;
    
    Hero(String name, int age,String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString(){
        return String.format(super.toString()+" And his power is %s",power);
    }
}

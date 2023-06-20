public class String_examples {

    public static void main(String[] args) {
        
        System.out.println("Running main");
        // Example1();
        // Example2();
        Example3();
    }


    public static void Example1() {
        // \ -> is escape operator. same as in python
        char percentageSign ='\n';

        // Examples of String call
        String name = "Iurii Skorokhod";

        // new keyword, for String call, also used as object creation of the class
        String sndName = new String("Skorokhod");

        // System.out.println("Saved char:" + percentageSign + "tab");
        System.out.println("My name is: " + name);
        System.out.println("My surname is: " + sndName);
    }

    public static void Example2() {
        String literalString1 = "abc";
        String literalString2 = "abc";
        String literalString3 = "ABC";
        
        
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
        String objectString3 = new String("XYZ");
    
        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2); // will return false, objects are different

        // but it will work if we compare content of the object
        System.out.println(objectString1.equals(objectString2));
        System.out.println(objectString1.equalsIgnoreCase(objectString3));
    
    }

    public static void Example3() {
        String name = "Iurii Skorokhod";
        String country = "Ukraine";
        int age = 31;

        // %d - for int
        // %f - for double/float 
        // %s - for String
        // %c - for char
        // %b - for boolean


        String formattedString = String.format("My name is %s. I am from %s. I am %d years old", name, country, age);


        // System.out.println("I am Iurii Skorokhod. I am from Ukraine and I am eager to learn Java");

        // System.out.println("I am " + name + ". I am from " + country + " and I am " + age + " years old.");

        String blank = "";
        
        System.out.println(formattedString);
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(blank.isBlank());

        //Upper-lower case change
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        // replace method
        String valera = "Valera is krasavchik";

        System.out.println(valera.replace("Valera", "Yura"));


        // Check if word or any "string" is in inside
        System.out.println(valera.contains("Valera"));
    }   
}

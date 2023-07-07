public class string_methods {
    
    public static void Example_string() {
        System.out.println("Main method of the file String_method.java.");
        String_methods();
    }

    public static void String_methods() {

        String name = "Iurii   ";

        // boolean result = name.equals("iurii"); // false because case sensitive 
        // boolean result = name.equalsIgnoreCase("iurii"); // true -> ignores case
        // int result = name.length(); // true -> ignores case
        // char result = name.charAt(1);
        // int result = name.indexOf('I');
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim(); // removes the spaces before and after
        String result = name.replace('I', 'Y').trim();

        
        System.out.printf("Result value |%s| \n", result);


    }
}

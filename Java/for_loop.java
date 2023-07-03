public class for_loop {
    public static void main(String[] args) {
        System.out.println("Main");
        Loop();
    }

    static void Loop(){
        System.out.println("loop:");       

        String valera ="Valera";
        
        System.out.printf("Vaelra's length: %d \n", valera.length());

        for (int i=0; i<valera.length(); i++) {
            // System.out.printf("Loop value: %d \n", i);   
            char nameChar = valera.charAt(i);
            System.out.printf("name: \'Valera\'; i-value/index: %d; char: %s \n", i, nameChar);
        }
    }
}

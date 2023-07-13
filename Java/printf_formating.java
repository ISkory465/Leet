import java.util.ArrayList;

public class printf_formating {
    public static void main(String[] args) {
        System.out.println("\n"+"-".repeat(23)+"");
        System.out.printf("%10sMain\n", " ");
        System.out.println("-".repeat(23)+"\n");

        Formating2();
    }

    static void Formating() {

        // ArrayList<String> ferrari = new ArrayList<String>();
        String[] ferrari = {"Portofino M", "F12", "F8 Tributo", "812 GTS", "296 GTB"};

        
        for (int i = 0; i<ferrari.length; i++) {
            System.out.printf("Ferrari: |%12s|\n", ferrari[i]);
        }

    }

    static void Formating2() {
        double pie = 3348738.14;

        System.out.printf("Test output of the float variable: |%,030.4f|\n", pie);
    }
}

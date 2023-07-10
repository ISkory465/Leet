import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        System.out.println("\nHello there! Main is running...\n");
        For_each();
    }

    public static void For_each(){

        ArrayList<String> ferrari = new ArrayList<String>();

        ferrari.add("Portofino M");
        ferrari.add("812 GTS");
        ferrari.add("F12");
        ferrari.add("F8 Tributo");

        int maxCarNameLength = 0;
        for (int i = 0; i<ferrari.size(); i++) {
            if (ferrari.get(i).length() > maxCarNameLength) {
                maxCarNameLength = ferrari.get(i).length();
            }
        }

        System.out.println("List of Ferraries that i would like to own");
        for (String carName: ferrari) {
            String spacesBeforeName = " ".repeat(maxCarNameLength-carName.length());
            String output = spacesBeforeName + carName;
            System.out.printf("Ferrari: |%s| \n", output);
        }
        System.out.println();
    }
}

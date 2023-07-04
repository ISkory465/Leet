import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        System.out.println("Main.");
        Nested();
    }


    static void Nested() {
        System.out.println(" Static test.");

        Scanner scanner = new Scanner(System.in);
        int col;
        int rows;
        String symbol = " ";

        System.out.print("ENter number of rows: ");
        rows = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ENter number of columns: ");
        col = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ENter the symbol to build the grid: ");
        symbol += scanner.nextLine();
        // scanner.nextLine();

        for (int i=0; i<rows; i++) {
            if(i==0) {
                System.out.print("");
            }
            else {
                System.out.println();    
            }
            // System.out.println();
            for (int j=0; j<col; j++){
                System.out.printf("%s", symbol);
            }
        }
        // System.out.println("\n");
    }
}

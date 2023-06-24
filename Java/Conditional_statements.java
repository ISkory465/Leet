import java.util.Scanner;


public class Conditional_statements {
    public static void main(String[] args) {
     
        //CHeck system output
        System.out.println("Main is running...");
        Example1();
    }


    private static void Example1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        //clear buffer
        scanner.nextLine();



        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        //clear buffer
        scanner.nextLine();

        //if condition:
        System.out.print("What operation do you want to do? ");
        String operation = scanner.nextLine();
        

        if (operation.equals("sum")){
            System.out.printf("The sum of the numbers %.2f + %.2f = %.2f \n", number1, number2, number1+number2);    
        } else if (operation.equals("sub")){
            System.out.printf("The subtraction of the numbers %.2f - %.2f = %.2f \n", number1, number2, number1-number2);    
        } else if (operation.equals("mult")){
            System.out.printf("The multiplication of the numbers %.2f * %.2f = %.2f \n", number1, number2, number1*number2);    
        } else if (operation.equals("div")){
            if (number2 == 0){
                System.out.printf("You can not divide by zero, you, stupid! \n");
            } else {
                System.out.printf("The division of the numbers %.2f / %.2f = %.2f \n", number1, number2, number1/number2);   
            }
            
        } else {
            System.out.printf("The peration %s is not supported by the current software version, kek. \n", operation);
        }
            
        




        //Output
        System.out.printf("First numbet %.2f; Second number %.2f \n", number1, number2);
        scanner.close();
    }

}

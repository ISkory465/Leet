public class switches {
    public static void main(String[] args) {
        System.out.println("Main is executed.");
        Example1();
    }

    public static void Example1() {
        System.out.println("Example1 is executed.");

        String day = "Valera";


        //if no match for any case the default is executed
        switch(day){
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("Invalid input!");
        }
        System.out.println("end");
    }
}

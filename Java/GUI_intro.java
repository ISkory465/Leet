import javax.swing.JOptionPane;

public class GUI_intro {
    /*
     * Taken from:
     * Java Full Course for free https://youtu.be/xk4_1vDrzzo?t=2954
     * Channel: Bro COde
     */
    public static void main(String[] args) {
        System.out.println("Main running...");  
        Gui_Example();
    }

    private static void Gui_Example() {
        String name = JOptionPane.showInputDialog("What is your name? ");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " freedom units tall.");
    }
}

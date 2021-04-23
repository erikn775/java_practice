import javax.swing.JOptionPane;

public class TacoCalculator {
    public static void main(String[] args) {
        String name, tacoAmount = "0";
        boolean isNumber = false;
        double tacoPrice = 2.50;
        double total = 0;
        name = JOptionPane.showInputDialog("Hi, what is your name?");

        while (total == 0){
            tacoAmount = JOptionPane.showInputDialog("Hi, " + name + " how many tacos would you like?");
            try {
                total = Integer.parseInt(tacoAmount) * tacoPrice;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please give amount as a number");
            }
        }

        JOptionPane.showMessageDialog(null,"Thanks " + name + ", " + tacoAmount + " tacos will be $" + String.format("%.2f", total));

    }
}

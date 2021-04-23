import javax.swing.JOptionPane;

public class TacoCalculator {
    public static void main(String[] args) {
        String name, tacoAmount;
        double tacoPrice = 2.50;
        double total;
        name = JOptionPane.showInputDialog("Hi, what is your name?");
        tacoAmount = JOptionPane.showInputDialog("Hi, " + name + " how many tacos would you like?");
        total = Integer.parseInt(tacoAmount) * tacoPrice;
        JOptionPane.showMessageDialog(null,"Thanks " + name + ", " + tacoAmount + " tacos will be $" + String.format("%.2f", total));

    }
}

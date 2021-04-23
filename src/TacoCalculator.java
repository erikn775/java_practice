//import java.util.Scanner;
//import javax.swing.JOptionPane;
//
//public class MyFirstProgram {
//    public static void main(String[] args) {
//        String strAmount;
//        int intAmount;
//        String food = "Tacos";
//        strAmount = JOptionPane.showInputDialog("How many " + food + " would you like?");
//        intAmount = Integer.parseInt(strAmount);
//        System.out.println("Ok " + intAmount + " " + food + " coming right up");
//    }
//}
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

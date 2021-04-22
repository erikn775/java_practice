import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyFirstProgram {
    public static void main(String[] args) {
        String strAmount;
        int intAmount;
        String food = "Tacos";
        strAmount = JOptionPane.showInputDialog("How many " + food + " would you like?");
        intAmount = Integer.parseInt(strAmount);
        System.out.println("Ok " + intAmount + " " + food + " coming right up");
    }
}


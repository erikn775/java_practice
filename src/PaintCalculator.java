import javax.swing.*;
import java.awt.EventQueue;
import java.awt.GridLayout;

public class PaintCalculator {
    public static void main(String[] args)
    {
        int totalSqFt = getSqFt();

        double costPerGallon = getPaintPricePerGallon();
        int gallons = getTotalGallons(totalSqFt);
        double paintCost = gallons * costPerGallon;

        double laborHours = getLaborHours(totalSqFt);
        double laborCost = laborHours * 18;
        double totalCost = paintCost + laborCost;

        JOptionPane.showMessageDialog(null,
                "Paint Cost (" + gallons + " gallons @ $ "
                        + costPerGallon + " per gallon): $ "
                        + String.format("%.2f", paintCost) + "\n"
                        + "Labor Cost (" + String.format("%.2f", laborHours) + " hours"
                        + " @ $18.00/hr): $ "
                        + String.format("%.2f", laborCost) + "\n"
                        + "Total Cost: $ "
                        + String.format("%.2f", totalCost));

    }

    private static int getTotalGallons(double wallSpace){
        return (int)(Math.ceil(wallSpace / 115));
    }

    private static double getLaborHours(double wallSpace){
        return wallSpace / (115.0 / 8);
    }

    private static double getPaintPricePerGallon(){
        String pricePerGallon = JOptionPane.showInputDialog("Cost of paint per gallon?");
        return Double.parseDouble(pricePerGallon);
    }

    private static int getSqFt(){
        String roomQuestion = JOptionPane.showInputDialog("How many rooms do you need painted?");
        int rooms = Integer.parseInt(roomQuestion);
        int totalSqFt = 0;

        for(int i = 0; i < rooms; i++){
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextField field1 = new JTextField("");
            panel.add(new JLabel("Room " + (i + 1) + " Square Footage"));
            panel.add(field1);
            int result = JOptionPane.showConfirmDialog(null, panel, "Paint Stuff and Things",
                    JOptionPane.DEFAULT_OPTION);
            totalSqFt += Integer.parseInt(field1.getText());
        }
        return totalSqFt;
    }
}

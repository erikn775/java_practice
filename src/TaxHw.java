import javax.swing.*;

public class TaxHw {

    public enum TaxBracket {
        Bracket0,
        Bracket12,
        Bracket22,
        Bracket24,
        Bracket32,
        Bracket35,
        Bracket37
    }
    public static void main(String[] args){

        double totalTaxes = 0;

        String givenIncome = JOptionPane.showInputDialog("What is your gross income?");

        int income = Integer.parseInt(givenIncome);

        switch (getTaxBracket(income))
        {
            case Bracket37:
                totalTaxes += (income - 518401) * .37;
            case Bracket35:
                totalTaxes += (Math.min(income, 518400) - 207351) * .35;
            case Bracket32:
                totalTaxes += (Math.min(income, 207351) - 163301) * .32;
            case Bracket24:
                totalTaxes += (Math.min(income, 163301) - 85526) * .24;
            case Bracket22:
                totalTaxes += (Math.min(income, 85526) - 40126) * .22;
            case Bracket12:
                totalTaxes += (Math.min(income, 40126) - 9876) * .12;
        }

        JOptionPane.showMessageDialog(null, "You owe $" + String.format("%.2f", totalTaxes) + " in taxes");
    }

    private static TaxBracket getTaxBracket(int grossIncome){
        if(grossIncome <= 9875)
            return TaxBracket.Bracket0;
        if(grossIncome <= 40125)
            return TaxBracket.Bracket12;
        if(grossIncome <= 85525)
            return TaxBracket.Bracket22;
        if(grossIncome <= 163300)
            return TaxBracket.Bracket24;
        if(grossIncome <= 207350)
            return TaxBracket.Bracket32;
        if(grossIncome <= 518400)
            return TaxBracket.Bracket35;

        return TaxBracket.Bracket37;
    }
}

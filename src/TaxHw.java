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

        int income;

        String givenIncome;

        givenIncome = JOptionPane.showInputDialog("What is your gross income?");

        income = Integer.parseInt(givenIncome);

        switch (getTaxBracket(income))
        {
            case Bracket37:
                totalTaxes +=;
            case Bracket35:
                totalTaxes +=;
            case Bracket32:
                totalTaxes +=;
            case Bracket24:
                totalTaxes +=;
            case Bracket22:
                totalTaxes +=;
            case Bracket12:
                totalTaxes +=;
            case Bracket0:
                totalTaxes +=;
        }
    }

    private static TaxBracket getTaxBracket(int grossIncome){
        if(grossIncome <= 9875)
            return TaxBracket.Bracket0;
        if(grossIncome > 9875 && grossIncome <= 40125)
            return TaxBracket.Bracket12;
        if(grossIncome > 40125 && grossIncome <= 85525)
            return TaxBracket.Bracket22;
        if(grossIncome > 85525 && grossIncome <= 163300)
            return TaxBracket.Bracket24;
        if(grossIncome > 163300 && grossIncome <= 207350)
            return TaxBracket.Bracket32;
        if(grossIncome > 207350 && grossIncome <= 518400)
            return TaxBracket.Bracket35;

        return TaxBracket.Bracket37;
    }
}

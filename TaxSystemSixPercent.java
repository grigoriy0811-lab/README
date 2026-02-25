package taxes;

public class TaxSystemSixPercent extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
         int income = debit * 6 / 100;
        if(income < 0) {
            return 0;
        }
        return income;
    }
}

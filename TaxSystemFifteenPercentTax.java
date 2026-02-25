package taxes;

public class TaxSystemFifteenPercentTax extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        if (profit <= 0) {
            return 0;
        }
        int tax = profit * 15 / 100;
        if (tax < 0) {
            return 0;
        }
        return tax;
    }

}

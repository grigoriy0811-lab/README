public class Main {
    public static void main(String[] args) {
        taxes.TaxSystem incomeUsn = new taxes.TaxSystemSixPercent();
        taxes.TaxSystem incomeUns2 = new taxes.TaxSystemFifteenPercentTax();

        Company companyOne = new Company("ООО Атлет", incomeUsn);
        Company companyTwo = new Company("000 Дуэт", incomeUns2);

        companyOne.shiftMoney(100000);
        companyOne.shiftMoney(20000);
        companyOne.shiftMoney(-10000);
        companyOne.payTaxes();

        companyTwo.shiftMoney(200000);
        companyTwo.shiftMoney(100000);
        companyTwo.shiftMoney(-50000);
        companyTwo.payTaxes();

    }
}
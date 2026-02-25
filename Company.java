import taxes.TaxSystem;

public class Company {
    String title;
    int debit;
    int credit;
    taxes.TaxSystem taxSystem;

    public Company(String title, taxes.TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit = debit + amount;
            System.out.println(title + " доход " + amount + " Общий доход " + debit);
        } else if (amount < 0) {
            int expense = Math.abs(amount);
            credit = credit + expense;
            System.out.println(title + " расход " + expense + " Общий расход " + credit);
        } else {
            System.out.println("Сумма не менялась!");
        }
    }

    public void setTaxSystem(taxes.TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.println(title + " налог составил " + taxAmount);

        debit = 0;
        credit = 0;

        System.out.println("Доходы и расходы обнулены!");
    }
}

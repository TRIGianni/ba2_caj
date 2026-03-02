package be.heh.payrollsystem.model;

public class BonusDecorator extends SalaryDecorator {
    private double bonusAmount;

    public BonusDecorator(Payable employee, double bonusAmount) {
        super(employee);

        this.bonusAmount = bonusAmount;
    }

    @Override
    public double calculatePay() {
        // On ajoute notre bonus au salaire de m'employé
        return super.calculatePay() + bonusAmount;
    }
}

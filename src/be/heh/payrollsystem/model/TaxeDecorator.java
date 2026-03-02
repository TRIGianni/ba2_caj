package be.heh.payrollsystem.model;

public class TaxeDecorator extends SalaryDecorator {
    private double taxeRate;

    /**
     * Applique une taxe sur le salaire de l'employé
     * @param employee L'employé
     * @param taxeRate Le taux de taxe à appliquer sur le salaire. Ex: 0.21 pour retirer 21% du salaire
     */
    public TaxeDecorator(Payable employee, double taxeRate) {
        super(employee);

        this.taxeRate = taxeRate;
    }

    @Override
    public double calculatePay() {
        // On applique les taxes au salaire
        return super.calculatePay() * (1 - taxeRate);
    }
}

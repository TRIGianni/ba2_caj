package be.heh.payrollsystem.model;

public abstract class SalaryDecorator implements Payable {
    private Payable employee;

    public SalaryDecorator(Payable employee) {
        this.employee = employee;
    }

    @Override
    public double calculatePay() {
        // On récupère le salaire de l'employé sur lequel on pointe.
        return employee.calculatePay();
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public String getId() {
        return employee.getId();
    }
}

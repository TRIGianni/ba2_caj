package be.heh.payrollsystem.model;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, String id,double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return this.monthlySalary;
    }
}

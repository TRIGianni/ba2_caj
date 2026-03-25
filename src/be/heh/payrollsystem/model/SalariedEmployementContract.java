package be.heh.payrollsystem.model;

public class SalariedEmployementContract extends EmployementContract {
    protected double monthlySalary;

    public SalariedEmployementContract(String employeeId, double monthlySalary) {
        super(employeeId);

        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getContractDetails() {
        return "%s : %f %n".formatted(employeeId, monthlySalary);
    }
}

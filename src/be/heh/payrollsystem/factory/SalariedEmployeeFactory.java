package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.*;

public class SalariedEmployeeFactory extends EmployeeFactory {
    protected double monthlySalary;

    public SalariedEmployeeFactory(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Employee createEmployee(String name, String id) {
        return new SalariedEmployee(
                name, id, monthlySalary
        );
    }

    @Override
    public EmployementContract createContract(String employeeId) {
        return new SalariedEmployementContract(employeeId, this.monthlySalary);
    }
}

package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.*;

public class SalariedEmployeeFactory extends EmployeeFactory {
    protected String name;
    protected String id;
    protected double monthlySalary;

    public SalariedEmployeeFactory(String name, String id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Employee createEmployee() {
        return new SalariedEmployee(
                name, id, monthlySalary
        );
    }
}

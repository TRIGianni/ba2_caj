package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.Employee;

public abstract class EmployeeFactory {
    public abstract Employee createEmployee();
}

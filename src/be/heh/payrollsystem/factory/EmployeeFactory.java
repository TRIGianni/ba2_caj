package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.Employee;
import be.heh.payrollsystem.model.EmployementContract;

public abstract class EmployeeFactory {
    public abstract Employee createEmployee(String name, String employeeId);
    public abstract EmployementContract createContract(String employeeId);
}

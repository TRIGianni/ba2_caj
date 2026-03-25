package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.*;

public class HourlyEmployeeFactory extends EmployeeFactory {
    protected double hourlyRate;
    protected int hoursWorked;

    public HourlyEmployeeFactory(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public Employee createEmployee(String name, String id) {
        return new HourlyEmployee(
                name, id, hourlyRate, hoursWorked
        );
    }

    @Override
    public EmployementContract createContract(String employeeId) {
        return new HourlyEmployementContract(employeeId, this.hourlyRate, this.hoursWorked);
    }
}

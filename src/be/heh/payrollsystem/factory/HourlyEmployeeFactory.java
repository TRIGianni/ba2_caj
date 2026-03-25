package be.heh.payrollsystem.factory;
import be.heh.payrollsystem.model.*;

public class HourlyEmployeeFactory extends EmployeeFactory {
    protected String name;
    protected String id;
    protected double hourlyRate;
    protected int hoursWorked;

    public HourlyEmployeeFactory(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public Employee createEmployee() {
        return new HourlyEmployee(
                name, id, hourlyRate, hoursWorked
        );
    }
}

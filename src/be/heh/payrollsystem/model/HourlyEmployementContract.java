package be.heh.payrollsystem.model;

public class HourlyEmployementContract extends EmployementContract {
    protected double hourlyRate;
    protected int hoursWorked;

    public HourlyEmployementContract(String employeeId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getContractDetails() {
        return "ID: %s %d/h temps de travail: %d h".formatted(employeeId, hourlyRate, hoursWorked);
    }
}

package be.heh.payrollsystem.model;

public abstract class EmployementContract {
    protected String employeeId;

    public EmployementContract(String employeeId) {
        this.employeeId = employeeId;
    }

    public abstract String getContractDetails();
}

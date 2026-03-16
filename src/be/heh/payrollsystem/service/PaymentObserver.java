package be.heh.payrollsystem.service;

public interface PaymentObserver {
    void update(String employeeId, String employeeName, double amount);
}

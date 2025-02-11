package be.heh.payrollsystem.service;

public interface PayrollRepository {
    void savePayment(String employeeid, String employeename, double amount);
}

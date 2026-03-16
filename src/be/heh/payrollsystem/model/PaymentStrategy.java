package be.heh.payrollsystem.model;

public interface PaymentStrategy {
    double calculatePay(Employee e);
}

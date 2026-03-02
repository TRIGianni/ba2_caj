package be.heh.payrollsystem.model;

public interface Payable {
    double calculatePay();
    String getName();
    String getId();
}

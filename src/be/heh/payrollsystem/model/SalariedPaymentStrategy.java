package be.heh.payrollsystem.model;

public class SalariedPaymentStrategy implements PaymentStrategy{
    @Override
    public double calculatePay(Employee e) {
        return e.getSalary();
    }
}

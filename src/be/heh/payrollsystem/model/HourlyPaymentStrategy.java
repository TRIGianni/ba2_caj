package be.heh.payrollsystem.model;

public class HourlyPaymentStrategy implements PaymentStrategy{
    @Override
    public double calculatePay(Employee e) {
        return e.getHourlyRate() * e.getHoursWorked();
    }
}

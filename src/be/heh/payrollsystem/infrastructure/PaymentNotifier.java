package be.heh.payrollsystem.infrastructure;

import be.heh.payrollsystem.service.PaymentObserver;

public class PaymentNotifier implements PaymentObserver {
    @Override
    public void update(String employeeId, String employeeName, double amount) {
        System.out.printf("Update PaymentNotifier, %s (%s) amo = %f%n", employeeName, employeeId, amount);
    }
}

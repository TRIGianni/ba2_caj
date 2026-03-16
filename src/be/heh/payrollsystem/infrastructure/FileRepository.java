package be.heh.payrollsystem.infrastructure;

import be.heh.payrollsystem.service.PaymentObserver;

public class FileRepository implements PaymentObserver {
    @Override
    public void update(String employeeId, String employeeName, double amount) {
        System.out.printf("Update filerepository, %s (%s) amo = %f%n", employeeName, employeeId, amount);
    }
}

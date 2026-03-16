package be.heh.payrollsystem.service;

import java.util.ArrayList;
import java.util.List;

public abstract class PaymentSubject {
    protected List<PaymentObserver> observers = new ArrayList();

    public void addObserver(PaymentObserver po) { this.observers.add(po); }
    public void removeObserver(PaymentObserver po) { this.observers.remove(po); }

    public void notifyObservers(String employeeId, String employeeName, double amount) {
        for (var observer : this.observers) {
            observer.update(employeeId, employeeName, amount);
        }
    }
}

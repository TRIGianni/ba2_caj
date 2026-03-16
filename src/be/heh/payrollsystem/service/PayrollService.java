package be.heh.payrollsystem.service;

import be.heh.payrollsystem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class PayrollService extends PaymentSubject {
    private List<Employee> employees = new ArrayList<>();

    public void processPayments(){
        for (var employee : this.employees) {
            notifyObservers(
                    employee.getId(),
                    employee.getName(),
                    employee.calculatePay()
            );
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

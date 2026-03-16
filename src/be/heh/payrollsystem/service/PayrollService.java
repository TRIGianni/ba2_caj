package be.heh.payrollsystem.service;

import be.heh.payrollsystem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    private List<Employee> employees = new ArrayList<>();
    private PayrollRepository pr;

    public PayrollService(PayrollRepository repo) {
        this.pr = repo;
    }

    public void processPayments(){
        for(Employee employee : employees){
            System.out.println(employee.getName()+" gagne : "+ employee.getPay() + "euros");
            pr.savePayment(employee.getId(), employee.getName(), employee.getPay());
        }

    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}

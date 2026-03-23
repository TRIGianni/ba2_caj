package be.heh.payrollsystem;

import be.heh.payrollsystem.model.CommissionerPaymentStrategy;
import be.heh.payrollsystem.model.Employee;
import be.heh.payrollsystem.model.SalariedPaymentStrategy;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee toto = Employee.createHourlyEmployee("toto", "1234", 20, 8);

        try {
            Employee bob = Employee.createSalariedEmployee("bob","2345", 15000000);
            Employee Alice = Employee.createCommissionEmployee("Alice","15",315,155.2);

            FileRepository fileRepository = new FileRepository();
            PayrollService payrollService = new PayrollService(fileRepository);
            payrollService.addEmployee(toto);
            payrollService.addEmployee(bob);
            payrollService.addEmployee(Alice);

            Alice.setPaymentStrategy(new CommissionerPaymentStrategy());
            payrollService.processPayments();
            toto.setPaymentStrategy(new SalariedPaymentStrategy());
            toto.setSalary(1440);

            payrollService.processPayments();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
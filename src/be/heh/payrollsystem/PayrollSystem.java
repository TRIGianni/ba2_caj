package be.heh.payrollsystem;

import be.heh.payrollsystem.model.Employee;
import be.heh.payrollsystem.model.SalariedPaymentStrategy;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee toto =
                new Employee("toto", "1234", 20, 8);

        try {
            Employee bob =
                    new Employee("bob","2345", 1500);

            FileRepository fileRepository = new FileRepository();
            PayrollService payrollService = new PayrollService(fileRepository);
            payrollService.addEmployee(toto);
            payrollService.addEmployee(bob);

            payrollService.processPayments();
            toto.setPaymentStrategy(new SalariedPaymentStrategy());
            toto.setSalary(1440);
            payrollService.processPayments();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
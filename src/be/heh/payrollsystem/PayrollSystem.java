package be.heh.payrollsystem;

import be.heh.payrollsystem.model.Employee;
import be.heh.payrollsystem.model.HourlyEmployee;
import be.heh.payrollsystem.model.SalariedEmployee;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee toto=
                new HourlyEmployee("toto", "1234", 20, 8);

        try {
            Employee bob =
                    new SalariedEmployee("bob","2345", 1500);

            FileRepository fileRepository = new FileRepository();
            PayrollService payrollService = new PayrollService(fileRepository);
            payrollService.addEmployee(toto);
            payrollService.addEmployee(bob);

            payrollService.processPayments();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
package be.heh.payrollsystem;

import be.heh.payrollsystem.factory.SalariedEmployeeFactory;
import be.heh.payrollsystem.model.Employee;
import be.heh.payrollsystem.model.HourlyEmployee;
import be.heh.payrollsystem.model.SalariedEmployee;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

public class PayrollSystem {

    public static void main(String[] args) {
        var professeurFactory = new SalariedEmployeeFactory(
                "Gianni Tricarico",
                "99",
                3000
        );
        Employee toto=
                new HourlyEmployee("toto", "1234", 20, 8);

        try {
            // Création d'une armée
            var trica1 = professeurFactory.createEmployee();
            var trica2 = professeurFactory.createEmployee();
            var trica3 = professeurFactory.createEmployee();

            System.out.printf("%s %s %s %n", trica1.getName(), trica2.getName(), trica3.getName());
            Employee bob =
                    new SalariedEmployee("bob","2345", 1500);

            FileRepository fileRepository = new FileRepository();
            PayrollService payrollService = new PayrollService(fileRepository);
            payrollService.addEmployee(trica1);
            payrollService.addEmployee(trica2);
            payrollService.addEmployee(trica3);

            payrollService.processPayments();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
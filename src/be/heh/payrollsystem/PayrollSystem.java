package be.heh.payrollsystem;

import be.heh.payrollsystem.factory.HourlyEmployeeFactory;
import be.heh.payrollsystem.factory.SalariedEmployeeFactory;
import be.heh.payrollsystem.model.*;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

import java.util.ArrayList;

public class PayrollSystem {

    public static void main(String[] args) {
        var professeurFactory = new SalariedEmployeeFactory(
                3000
        );

        var intervenantFactory = new HourlyEmployeeFactory(
                3000,0
        );

        try {
            var trica = professeurFactory.createEmployee("Gianni Tricarico", "99");
            var lucas = professeurFactory.createEmployee("Lucas Amand", "10");
            var jospin = intervenantFactory.createEmployee("Lionel Jospin", "2025");
            var electricien = intervenantFactory.createEmployee("L'électricien", "69420");
            var allEmployees = new ArrayList<Employee>();
            allEmployees.add(trica);
            allEmployees.add(lucas);
            allEmployees.add(jospin);
            allEmployees.add(electricien);

            var contractTrica = professeurFactory.createContract(trica.getId());
            var contractLucas = professeurFactory.createContract(lucas.getId());
            var contractJospin = intervenantFactory.createContract(jospin.getId());

            var allContracts = new ArrayList<EmployementContract>();
            allContracts.add(contractTrica);
            allContracts.add(contractLucas);
            allContracts.add(contractJospin);

            var fileRepository = new FileRepository();
            var prs = new PayrollService(fileRepository);

            for (var employee : allEmployees) {
                prs.addEmployee(employee);
                System.out.printf("Employé créé: %s payé %f %n", employee.getName(), employee.calculatePay());
            }

            for (var contract : allContracts) {
                System.out.println(contract.getContractDetails());
            }

            prs.processPayments();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
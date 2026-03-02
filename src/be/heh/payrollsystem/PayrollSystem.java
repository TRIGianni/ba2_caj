package be.heh.payrollsystem;

import be.heh.payrollsystem.model.*;
import be.heh.payrollsystem.persistance.FileRepository;
import be.heh.payrollsystem.service.PayrollService;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee toto=
                new HourlyEmployee("toto", "1234", 20, 8);

        try {
            Employee bob =
                    new SalariedEmployee("bob","2345", 1500);

            BonusDecorator bobBonus = new BonusDecorator(
                    bob,
                    50000
            );

            TaxeDecorator totoTaxes = new TaxeDecorator(
                    toto,
                    0.43
            );

            TaxeDecorator bobSansFraude = new TaxeDecorator(
                    bobBonus,
                    0.43
            );

            System.out.printf("Bob a été payé %.2f\n", bobBonus.calculatePay());
            System.out.printf("Toto sera payé %.2f car il a payé des taxes.%n", totoTaxes.calculatePay());
            System.out.printf(
                    "Bob s'est fait attraper par le FISC et sera payé seulement %.2f%n" ,
                    bobSansFraude.calculatePay()
                    );

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
package be.heh.payrollsystem.persistance;

import be.heh.payrollsystem.service.PayrollRepository;

public class FileRepository implements PayrollRepository {

    @Override
    public void savePayment(String employeeid, String employeename, double amount) {
        System.out.println(employeeid + " " + employeename);
    }
}

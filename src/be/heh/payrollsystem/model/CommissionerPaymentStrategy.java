package be.heh.payrollsystem.model;

public class CommissionerPaymentStrategy  implements PaymentStrategy{
    @Override
    public double calculatePay(Employee e){
    return e.getCommissionRate() * e.getSales();
    }
}

package be.heh.payrollsystem.model;

public class Employee {
    private String name;
    private String id;

    private double salary = 0.0;
    private double hourlyRate = 0.0;
    private int hoursWorked = 0;

    private PaymentStrategy paymentStrategy;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        setPaymentStrategy(new SalariedPaymentStrategy());
    }

    public Employee(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        setPaymentStrategy(new HourlyPaymentStrategy());
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPay() { return paymentStrategy.calculatePay(this); }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

}

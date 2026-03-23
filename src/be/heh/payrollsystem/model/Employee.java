package be.heh.payrollsystem.model;

public class Employee {
    private String name;
    private String id;

    private double salary = 0.0;
    private double hourlyRate = 0.0;
    private int hoursWorked = 0;
    private double sales = 0;
    private double commissionRate = 0;

    private PaymentStrategy paymentStrategy;

    private Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        setPaymentStrategy(new SalariedPaymentStrategy());
    }

    private Employee(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        setPaymentStrategy(new HourlyPaymentStrategy());
    }
    private Employee(){

    }

    public static Employee createHourlyEmployee(String name, String id, double hourlyRate,int hoursWorked ){
    return new Employee(name,id,hourlyRate,hoursWorked);
    }
    public static Employee createSalariedEmployee(String name, String id, double salary){
    return new Employee(name,id,salary);
    }
    public static Employee createCommissionEmployee(String name, String id, double sales,double commissionRate ){
        Employee  e= new Employee();
        e.name=name;
        e.id=id;
        e.sales=sales;
        e.commissionRate=commissionRate;

        return e;
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
    public double getSales(){
        return sales;
    }
    public double getCommissionRate(){
        return commissionRate;
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

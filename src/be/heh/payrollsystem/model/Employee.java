package be.heh.payrollsystem.model;

public abstract class Employee implements Payable{
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public abstract double calculatePay();
}

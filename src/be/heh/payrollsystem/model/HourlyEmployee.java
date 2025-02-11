package be.heh.payrollsystem.model;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Le taux horaire ne peut pas être négatif.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Le nombre d'heures ne peut pas être négatif.");
        }
        this.hoursWorked = hoursWorked;
    }
}

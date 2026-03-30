package be.heh.payrollsystem.model;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    private HourlyEmployee(Builder builder) {
        super(builder.name, builder.id);
        setHourlyRate(builder.hourlyRate);
        setHoursWorked(builder.hoursWorked);
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

    public static class Builder {
        protected String name;
        protected String id;

        protected double hourlyRate = 100.0;
        protected int hoursWorked = 42;

        public Builder(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public Builder setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Builder setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public HourlyEmployee build() {
            return new HourlyEmployee(this);
        }
    }
}

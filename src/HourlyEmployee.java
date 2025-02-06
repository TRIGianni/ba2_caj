public class HourlyEmployee {
    private String name;
    private String id;
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

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

public class TemperatureRecord {
    private double temperatureCelsius;
    private double temperatureFahrenheit;
    private boolean active;
    private String statusReason;

    public TemperatureRecord(double temperatureCelsius, double temperatureFahrenheit, boolean active, String statusReason) {
        this.temperatureCelsius = temperatureCelsius;
        this.temperatureFahrenheit = temperatureFahrenheit;
        this.active = active;
        this.statusReason = statusReason;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getStatusReason() {
        return statusReason;
    }
}
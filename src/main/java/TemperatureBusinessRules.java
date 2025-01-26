public class TemperatureBusinessRules {
    private Double previousTemperatureCelsius = null;
    private Double previousTemperatureFahrenheit = null;
    private String statusReason = "No data";

    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public void updateStatusReason(double currentTempCelsius) {
        if (previousTemperatureCelsius == null) {
            statusReason = "First record";
        } else if (currentTempCelsius == previousTemperatureCelsius) {
            statusReason = "Weather Unchanged";
        } else if (currentTempCelsius > previousTemperatureCelsius) {
            statusReason = "Warming";
        } else {
            statusReason = "Cooling";
        }

        previousTemperatureCelsius = currentTempCelsius;
        previousTemperatureFahrenheit = convertToFahrenheit(currentTempCelsius);
    }

    public String getStatusReason() {
        return statusReason;
    }

    public Double getPreviousTemperatureCelsius() {
        return previousTemperatureCelsius;
    }

    public Double getPreviousTemperatureFahrenheit() {
        return previousTemperatureFahrenheit;
    }
}
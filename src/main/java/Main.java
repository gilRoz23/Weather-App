public class Main {
    public static void main(String[] args) throws Exception {
        TemperatureService service = new TemperatureService();
        TemperatureBusinessRules rules = new TemperatureBusinessRules();
        DataverseRepository repository = new DataverseRepository();

        double tempFahrenheit = service.fetchTemperature();
        double tempCelsius = rules.convertToCelsius(tempFahrenheit);

        rules.updateStatusReason(tempCelsius);

        TemperatureRecord record = new TemperatureRecord(
                tempCelsius,
                tempFahrenheit,
                true,
                rules.getStatusReason()
        );
        repository.saveRecord(record);

        System.out.println("Latest Record:");
        System.out.println("Celsius: " + record.getTemperatureCelsius());
        System.out.println("Fahrenheit: " + record.getTemperatureFahrenheit());
        System.out.println("Status: " + record.getStatusReason());
    }
}
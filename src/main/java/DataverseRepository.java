import java.util.ArrayList;
import java.util.List;

public class DataverseRepository {
    private List<TemperatureRecord> records = new ArrayList<>();

    public void saveRecord(TemperatureRecord record) {
        records.forEach(r -> r.setActive(false));

        record.setActive(true);
        records.add(record);
    }

    public List<TemperatureRecord> getAllRecords() {
        return records;
    }
}
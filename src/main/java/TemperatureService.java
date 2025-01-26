import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TemperatureService {
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "e81ceed29dace9784415236094429841";
    private static final String CITY = "Tel-aviv";

    public double fetchTemperature() throws Exception {
        String url = String.format("%s?q=%s&appid=%s&units=metric", API_URL, CITY, API_KEY);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            String responseBody = EntityUtils.toString(response.getEntity());
            JsonObject json = JsonParser.parseString(responseBody).getAsJsonObject();
            double temperature = json.getAsJsonObject("main").get("temp").getAsDouble();
            return temperature;
        }
    }
}

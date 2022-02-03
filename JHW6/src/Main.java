import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {
        String accuWeatherApiKey = args[0]; // pass API key for AccuWeather as command line argument
        String accuWeatherCityKey = "295212"; // Saint-Petersburg, RU
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"
                        + accuWeatherCityKey + "?apikey=" + accuWeatherApiKey))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (InterruptedException|IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.anastasiia.weather.conditions.WeatherResponse;
import com.anastasiia.weather.forecast.WeatherForecastResponse;
import com.anastasiia.weather.forecast.DailyForecast;

public class Main {

    public static void main(String[] args) {
        String accuWeatherApiKey = args[0]; // pass API key for AccuWeather as command line argument
        String accuWeatherCityKey = "295212"; // Saint-Petersburg, RU
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        HttpRequest requestConditions = HttpRequest.newBuilder()
                .uri(URI.create("http://dataservice.accuweather.com/currentconditions/v1/"
                        + accuWeatherCityKey + "?apikey=" + accuWeatherApiKey))
                .build();
        try {
//            System.out.println("Response code: " + responseConditions.statusCode());
//            System.out.println("Body: " + responseConditions.body());

            HttpResponse<String> responseConditions = client.send(requestConditions, HttpResponse.BodyHandlers.ofString());
            try {
                WeatherResponse[] weatherResponse = objectMapper.readValue(responseConditions.body(), WeatherResponse[].class);
                System.out.println("Текущая погода " + weatherResponse[0].getWeatherText() + ", температура - " +
                        weatherResponse[0].getTemperature().getMetric().getValue());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException|IOException e) {
            e.printStackTrace();
        }



        HttpRequest requestForecast = HttpRequest.newBuilder()
                .uri(URI.create("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"
                        + accuWeatherCityKey + "?apikey=" + accuWeatherApiKey + "&metric=true"))
                .build();
        try {
            HttpResponse<String> responseForecast = client.send(requestForecast, HttpResponse.BodyHandlers.ofString());
            try {
//                System.out.println("Response code: " + responseForecast.statusCode());
//                System.out.println("Body: " + responseForecast.body());

                WeatherForecastResponse weatherForecastResponse = objectMapper.readValue(responseForecast.body(), WeatherForecastResponse.class);
                for (DailyForecast day: weatherForecastResponse.getDailyForecasts()) {
                    System.out.println("В городе Saint Petersburg на дату " + ZonedDateTime.parse(day.getDate()).toLocalDate() +
                            " ожидается " + day.getDay().getIconPhrase() +
                            ", температура - " + day.getTemperature().getMinimum().getValue() +
                            " - " + day.getTemperature().getMaximum().getValue());
                }
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException| IOException e) {
            e.printStackTrace();
        }
    }
}

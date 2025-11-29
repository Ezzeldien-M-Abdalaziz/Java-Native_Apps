package com.Ezzeldien.WeatherForecastApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApi {
    private static final String API_KEY = env.API_KEY;
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast";

    public String getForecast(String city) throws IOException {
        String apiUrl = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric"; //the url
        URL url = new URL(apiUrl); //init the url
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //open the connection using the url
        connection.setRequestMethod("GET"); //use the get method
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())); //read from the api
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}
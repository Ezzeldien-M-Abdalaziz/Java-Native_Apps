package com.Ezzeldien.WeatherForecastApp;

import java.io.IOException;

public class WeatherApp {

    public static void main(String[] args) throws IOException {

        WeatherApi weatherApi = new WeatherApi();
        System.out.println(weatherApi.getForecast("Cairo"));
    }
}

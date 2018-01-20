package com.kris.observer_pattern.impl.solution_push;


import com.kris.observer_pattern.impl.model.WeatherData;
import com.kris.observer_pattern.impl.solution_push.concrete_observers.ForecastDisplay;

/**
 * Client to test "Push" solution
 */
public class Client {

    public static void main(String[] args) {
        WeatherSubject subject = new WeatherSubject();
        ForecastDisplay forecastDisplay = new ForecastDisplay(subject);

        // Weather data first time update and display
        subject.statusUpdated(getWeatherDataFirstUpdate());
        forecastDisplay.display();

        // Weather data second time update and display
        subject.statusUpdated(getWeatherDataSecondUpdate());
        forecastDisplay.display();
    }

    private static WeatherData getWeatherDataFirstUpdate() {
        WeatherData data = new WeatherData();
        data.setTemperature("30");
        data.setHumidity("30%");
        return data;
    }

    private static WeatherData getWeatherDataSecondUpdate() {
        WeatherData data = new WeatherData();
        data.setTemperature("35");
        data.setHumidity("35%");
        return data;
    }

}

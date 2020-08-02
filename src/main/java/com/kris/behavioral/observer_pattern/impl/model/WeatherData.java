package com.kris.behavioral.observer_pattern.impl.model;

/**
 * This is the weather data model to be used by Subject, to send data to its observers.
 */
public class WeatherData {

    private String temperature;
    private String humidity;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}

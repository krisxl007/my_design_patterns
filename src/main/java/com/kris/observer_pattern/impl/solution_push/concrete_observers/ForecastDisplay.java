package com.kris.observer_pattern.impl.solution_push.concrete_observers;


import com.kris.observer_pattern.impl.Observer;
import com.kris.observer_pattern.impl.Subject;
import com.kris.observer_pattern.impl.model.WeatherData;

/**
 * This is the concrete observer class that registered to WeatherSubject.
 */
public class ForecastDisplay implements Observer {

    // Subject reference in concrete observer class is a must, to be used to register to subject.
    private Subject weatherSubject;

    // Weather data to display
    private String temperature;
    private String humidity;

    public ForecastDisplay(Subject subject) {
        this.weatherSubject = subject;
        weatherSubject.addObserver(this);
    }

    /**
     * In observer pattern "Push" solution, parameter subject will be null and only data object will be used.
     * @param subject will be null.
     * @param arg only this parameter will be used.
     */
    @Override
    public void update(Subject subject, Object arg) {
        if(arg != null && arg instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) arg;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
        }
    }


    public void display() {
        System.out.println("============= New Forecast Updating ============");
        System.out.println("temperature: " + temperature + " degree");
        System.out.println("humidity: " + humidity);
    }

}

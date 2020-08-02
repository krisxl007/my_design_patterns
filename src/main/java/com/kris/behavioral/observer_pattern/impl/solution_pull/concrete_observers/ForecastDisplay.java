package com.kris.behavioral.observer_pattern.impl.solution_pull.concrete_observers;


import com.kris.behavioral.observer_pattern.impl.Observer;
import com.kris.behavioral.observer_pattern.impl.Subject;
import com.kris.behavioral.observer_pattern.impl.solution_pull.WeatherSubject;

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
     * In observer pattern "Pull" solution, parameter subject will be used and data object will be null.
     * @param subject will be used.
     * @param arg will be null.
     */
    @Override
    public void update(Subject subject, Object arg) {
        if(subject != null && subject instanceof WeatherSubject) {
            WeatherSubject weatherSubject = (WeatherSubject) subject;
            temperature = weatherSubject.getTemperature();
            humidity = weatherSubject.getHumidity();
        }
    }


    public void display() {
        System.out.println("============= New Forecast Updating ============");
        System.out.println("temperature: " + temperature + " degree");
        System.out.println("humidity: " + humidity);
    }

}

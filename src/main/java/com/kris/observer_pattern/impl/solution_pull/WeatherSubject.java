package com.kris.observer_pattern.impl.solution_pull;


import com.kris.observer_pattern.impl.Observer;
import com.kris.observer_pattern.impl.Subject;
import com.kris.observer_pattern.impl.model.WeatherData;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the concrete weather subject and using "Pull" way to implement observer pattern, it means when notifying
 * observers will calling update(subject, null) method.
 */
public class WeatherSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private boolean changed = false;

    // Weather data
    private String temperature;
    private String humidity;


    /**
     * Assuming this method is called when forecast update weather data to us.
     */
    public void statusUpdated(WeatherData data) {
        temperature = data.getTemperature();
        humidity = data.getHumidity();
        setChanged();
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        if (observers != null && o != null) {
            observers.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        if (observers != null && o != null) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer : observers) {
                /*
                    Pull solution: Sending the whole subject object to observers to let each observer pick their
                    interested data only, subject object has to provide getter method with this solution.
                 */
                observer.update(this, null);
            }
        }
        clearChanged();
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public void clearChanged() {
        changed = false;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }
}

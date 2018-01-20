package com.kris.observer_pattern.impl;

/**
 * Observer pattern subject interface
 */
public interface Subject {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
    void setChanged();
    void clearChanged();
}

package com.kris.observer_pattern.impl;

/**
 * Observer pattern observer interface
 */
public interface Observer {
    void update(Subject subject, Object arg);
}

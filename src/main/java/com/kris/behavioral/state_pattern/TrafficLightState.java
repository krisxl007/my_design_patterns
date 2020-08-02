package com.kris.behavioral.state_pattern;

public interface TrafficLightState {

    void lightOn();
    void changeState(TrafficLightController trafficLightController);
}

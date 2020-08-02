package com.kris.behavioral.state_pattern.concrete_states;

import com.kris.behavioral.state_pattern.TrafficLightController;
import com.kris.behavioral.state_pattern.TrafficLightState;

public class RedTrafficLight implements TrafficLightState {

    public void lightOn() {
        System.out.println("Red light is on now...");
    }

    public void changeState(TrafficLightController trafficLightController) {
        trafficLightController.setTrafficLightState(new GreenTrafficLight());
    }
}

package com.kris.behavioral.state_pattern.concrete_states;

import com.kris.behavioral.state_pattern.TrafficLightController;
import com.kris.behavioral.state_pattern.TrafficLightState;

public class YellowTrafficLight implements TrafficLightState {

    public void lightOn() {
        System.out.println("Yellow light is on now...");
    }

    public void changeState(TrafficLightController trafficLightController) {
        trafficLightController.setTrafficLightState(new RedTrafficLight());
    }
}

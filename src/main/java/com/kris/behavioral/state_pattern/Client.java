package com.kris.behavioral.state_pattern;

import com.kris.behavioral.state_pattern.concrete_states.GreenTrafficLight;

/**
 * Client to display different states
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightController trafficLightController = new TrafficLightController();
        trafficLightController.setTrafficLightState(new GreenTrafficLight());
        trafficLightController.displayTrafficLight();
    }
}

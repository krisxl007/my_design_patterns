package com.kris.behavioral.state_pattern;

/**
 * This is the state context, holding a state and the state can be changed.
 */
public class TrafficLightController {

    // context is holding a state, which can be changed by some conditions.
    private TrafficLightState trafficLightState;

    public void displayTrafficLight() throws InterruptedException {
        for(;;) {
            trafficLightState.lightOn();

            // light on 3 seconds
            Thread.sleep(3000);

            trafficLightState.changeState(this);
        }
    }

    public TrafficLightState getTrafficLightState() {
        return trafficLightState;
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }
}

package com.kris.factory_pattern.abstract_factory_pattern;

/**
 * Concrete Toyota factory
 */
public class ToyotaFactory {

    /**
     * This is the factory method, concrete factory normally use factory method to create concrete object.
     */
    public static Car buildCar() {
        return new Toyota();
    }
}

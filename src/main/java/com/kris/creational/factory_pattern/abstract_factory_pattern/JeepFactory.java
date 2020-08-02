package com.kris.creational.factory_pattern.abstract_factory_pattern;

/**
 * Concrete Jeep factory
 */
public class JeepFactory {

    /**
     * This is the factory method, concrete factory normally use factory method to create concrete object.
     */
    public static Car buildCar() {
        return new Jeep();
    }
}

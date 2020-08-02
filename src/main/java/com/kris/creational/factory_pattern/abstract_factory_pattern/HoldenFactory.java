package com.kris.creational.factory_pattern.abstract_factory_pattern;

/**
 * Concrete Holden factory
 */
public class HoldenFactory {

    /**
     * This is the factory method, concrete factory normally use factory method to create concrete object.
     */
    public static Car buildCar() {
        return new Holden();
    }
}

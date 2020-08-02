package com.kris.creational.factory_pattern.abstract_factory_pattern;

/**
 * This is the abstract factory class.
 */
public class CarFactory {

    enum Brand {
        TOYOTA,
        HOLDEN,
        JEEP
    }

    /**
     * Abstract factory method to create object via each concrete factory
     */
    public static Car getCar(Brand brand) {
        if(Brand.TOYOTA.equals(brand)) {
            return ToyotaFactory.buildCar();
        }else if(Brand.HOLDEN.equals(brand)) {
            return HoldenFactory.buildCar();
        }else if(Brand.JEEP.equals(brand)) {
            return JeepFactory.buildCar();
        }

        return null;
    }
}

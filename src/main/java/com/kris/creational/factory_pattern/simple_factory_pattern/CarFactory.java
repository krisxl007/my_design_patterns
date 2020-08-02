package com.kris.creational.factory_pattern.simple_factory_pattern;

/**
 * The factory class itself, to create different brand cars.
 * *Disadvantage: when you want to add more brand, have to modify this class, which destroy Open-Close principle.
 */
public class CarFactory {

    enum Brand {
        TOYOTA,
        HOLDEN,
        JEEP
    }

    public static Car getCar(Brand brand) {
        if(Brand.TOYOTA.equals(brand)) {
            return new Toyota();
        }else if(Brand.HOLDEN.equals(brand)) {
            return new Holden();
        }else if(Brand.JEEP.equals(brand)) {
            return new Jeep();
        }

        return null;
    }
}

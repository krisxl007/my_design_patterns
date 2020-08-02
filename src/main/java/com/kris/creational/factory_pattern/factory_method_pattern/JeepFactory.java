package com.kris.creational.factory_pattern.factory_method_pattern;

public class JeepFactory implements Car {

    private String price = "$100000";

    @Override
    public String getPrice() {
        return price;
    }

    /**
     * This is the factory method, the advantage of factory method is that when you want to add more car brand, you can
     * create a brand factory rather than modify the car factory itself.
     */
    public static Car getCar() {
        return new JeepFactory();
    }
}

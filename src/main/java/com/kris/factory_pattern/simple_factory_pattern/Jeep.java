package com.kris.factory_pattern.simple_factory_pattern;

public class Jeep implements Car {

    private String price = "$100000";

    @Override
    public String getPrice() {
        return price;
    }
}

package com.kris.creational.factory_pattern.simple_factory_pattern;

public class Toyota implements Car {

    private String price = "$50000";

    @Override
    public String getPrice() {
        return price;
    }
}

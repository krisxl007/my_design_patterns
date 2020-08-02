package com.kris.creational.factory_pattern.abstract_factory_pattern;

public class Holden implements Car {

    private String price = "$80000";

    @Override
    public String getPrice() {
        return price;
    }
}

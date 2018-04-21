package com.kris.factory_pattern.abstract_factory_pattern;

public class Toyota implements Car {

    private String price = "$50000";

    @Override
    public String getPrice() {
        return price;
    }
}

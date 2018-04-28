package com.kris.builder_pattern;

/**
 * Client to create car object.
 */
public class Client {

    public static void main(String[] args) {

        Car holden = new Car.CarBuilder("Holden", "V6").setColour("Black").setPrice("$80000").setTyre("Soft tyre").build();
        Car jeep = new Car.CarBuilder("Jeep", "V8").setColour("White").setPrice("$100000").setTyre("Hard tyre").build();

        System.out.println(holden.toString());
        System.out.println(jeep.toString());
    }
}

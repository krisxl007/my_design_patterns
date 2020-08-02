package com.kris.creational.factory_pattern.factory_method_pattern;

/**
 * Factory method pattern test client.
 */
public class Client {

    public static void main(String[] args) {
        Car japaneseCar = ToyotaFactory.getCar();
        Car australianCar = HoldenFactory.getCar();
        Car americanCar = JeepFactory.getCar();

        System.out.println("Japanese car price: " + japaneseCar.getPrice());
        System.out.println("Australian car price: " + australianCar.getPrice());
        System.out.println("American car price: " + americanCar.getPrice());
    }
}

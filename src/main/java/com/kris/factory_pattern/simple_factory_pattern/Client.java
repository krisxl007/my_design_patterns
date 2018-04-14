package com.kris.factory_pattern.simple_factory_pattern;

/**
 * Simple factory pattern test client.
 */
public class Client {

    public static void main(String[] args) {
        Car japaneseCar = CarFactory.getCar(CarFactory.Brand.TOYOTA);
        Car australianCar = CarFactory.getCar(CarFactory.Brand.HOLDEN);
        Car americanCar = CarFactory.getCar(CarFactory.Brand.JEEP);

        System.out.println("Japanese car price: " + japaneseCar.getPrice());
        System.out.println("Australian car price: " + australianCar.getPrice());
        System.out.println("American car price: " + americanCar.getPrice());
    }
}

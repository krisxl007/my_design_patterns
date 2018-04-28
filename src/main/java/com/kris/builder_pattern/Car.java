package com.kris.builder_pattern;

/**
 * Use a nested class CarBuilder as the builder to make the code simpler.
 */
public class Car {

    // required variables
    private String brand;
    private String engine;

    // optional variables
    private String colour;
    private String price;
    private String tyre;

    // private constructor to allow only builder(CarBuilder) to create Car object
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.engine = builder.engine;
        this.colour = builder.colour;
        this.price = builder.price;
        this.tyre = builder.tyre;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public String getPrice() {
        return price;
    }

    public String getTyre() {
        return tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", price='" + price + '\'' +
                ", tyre='" + tyre + '\'' +
                '}';
    }

    public static class CarBuilder {

        // required variables
        private String brand;
        private String engine;

        // optional variables
        private String colour;
        private String price;
        private String tyre;

        public CarBuilder(String brand, String engine) {
            this.brand = brand;
            this.engine = engine;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public CarBuilder setTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

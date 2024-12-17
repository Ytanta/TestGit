package stroitel.cars;

import stroitel.components.Engine;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;

    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine ) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }



}
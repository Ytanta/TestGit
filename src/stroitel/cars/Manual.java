package stroitel.cars;

import stroitel.components.Engine;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;

    public Manual(CarType carType, int seats, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;

    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";

        return info;
    }
}
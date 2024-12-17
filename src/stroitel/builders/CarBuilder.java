package stroitel.builders;

import stroitel.cars.Car;
import stroitel.cars.CarType;
import stroitel.components.Engine;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;


    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public Car getResult() {
        return new Car(type, seats, engine);
    }
}
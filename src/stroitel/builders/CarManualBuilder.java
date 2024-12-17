package stroitel.builders;

import stroitel.cars.CarType;
import stroitel.cars.Manual;
import stroitel.components.Engine;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;


    @Override
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



    public Manual getResult() {
        return new Manual(type, seats, engine);
    }
}

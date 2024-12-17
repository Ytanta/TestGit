package stroitel.builders;

import stroitel.cars.CarType;
import stroitel.components.Engine;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);

}
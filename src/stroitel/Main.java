package stroitel;

import stroitel.builders.CarBuilder;
import stroitel.builders.CarManualBuilder;
import stroitel.cars.Car;
import stroitel.cars.Manual;
import stroitel.director.Director;


public class Main {
    public static void main(String[] args) {
        Director director = new Director();


        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        Car car = builder.getResult();
        System.out.printf("Car built: %s\nEngine: %d",  car.getCarType(),  car.getSeats());
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());






        }
    }

package AdvancedA4_Cars;

public class GasBurningCar extends Car {

    int gasTank;

    public GasBurningCar(int year, String model, String brand, int gasTank){
        super(year, model, brand);
        this.gasTank = gasTank;
    }
}

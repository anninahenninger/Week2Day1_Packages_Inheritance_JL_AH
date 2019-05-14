package AdvancedA4_Cars;

public class ElectricCar extends Car {

    int ampereHours;

    public ElectricCar(int year, String model, String brand, int ampereHours){
        super(year, model, brand);
        this.ampereHours = ampereHours;
    }
}

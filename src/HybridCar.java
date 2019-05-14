public class HybridCar extends Car {

    int ampereHours;
    int gasTank;

    public HybridCar(int year, String model, String brand, int ampereHours, int gasTank){
        super(year, model, brand);
        this.ampereHours = ampereHours;
        this.gasTank = gasTank;
    }
}

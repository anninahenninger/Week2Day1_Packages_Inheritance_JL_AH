public class Manager extends Employee{

    public Manager (String name, int age, double hourlyRate){
        super(name, age, hourlyRate);

    }

    public double salary (double h){

        double calcSal = h * this.hourlyRate;

        return calcSal;
    }


}

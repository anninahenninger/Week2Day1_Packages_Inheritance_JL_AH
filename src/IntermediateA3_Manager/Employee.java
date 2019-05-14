package IntermediateA3_Manager;

public abstract class Employee {
    public String name;
    public int age;
    public double hourlyRate;

    public Employee (String name, int age, double hourlyRate){
        this.name = name;
        this.age = age;
        this.hourlyRate =hourlyRate;

    }

    public abstract double salary (double h);

    public String toString(){
         return("The employee "+this.name+" is "+this.age+" old and has an hourly Rate of "+this.hourlyRate);
    }
}

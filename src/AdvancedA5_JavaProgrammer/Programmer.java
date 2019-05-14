package AdvancedA5_JavaProgrammer;//imports package

public class Programmer {

    String jobDescription;
    String mainTask;
    double salary;

    public Programmer (String jobDescription, String mainTask, double salary){
        this.jobDescription = jobDescription;
        this.mainTask = mainTask;
        this.salary = salary;

    }

    public String toString(){
        return ("The Job description for is "+this.jobDescription + " and the main tasks is "+this.mainTask+" and the Salary is "+this.salary);
    }

}

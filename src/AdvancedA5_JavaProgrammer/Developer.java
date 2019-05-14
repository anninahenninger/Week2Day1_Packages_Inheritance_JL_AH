package AdvancedA5_JavaProgrammer;


public class Developer extends Programmer {

    String addRespon;
    double addSalary;

    public Developer (String jobDescription, String mainTask, double salary, String addRespon, double addSalary){
        super(jobDescription, mainTask, salary);
        this.addRespon = addRespon;
        this.addSalary = addSalary;
    }

    public double calcDevSal (){
        double devSal = salary + addSalary;
        return(devSal);

    }
    @Override
    public String toString(){
        return ("The Job description for is "+this.jobDescription + " and the main tasks is "+this.mainTask+" and the Salary is "+this.salary+"." +
                "Additional responsibilities are "+this.addRespon+ "and the Salary is about " +calcDevSal());
    }



}

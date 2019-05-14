package AdvancedA5_JavaProgrammer;

public class Architect extends Programmer {
    String experience;
    double archSal;

    public Architect (String jobDescription, String mainTask, double salary, String experience, double archSal){
        super(jobDescription, mainTask, salary);
        this.experience = experience;
        this.archSal = archSal;
    }

    public double calcArchSal (){
        double salArc = salary + archSal;
        return(salArc);

    }
    @Override
    public String toString(){
        return ("The Job description for is "+this.jobDescription + " and the main tasks is "+this.mainTask+" and the Salary is "+this.salary+"." +
                "Additional experience is needed like "+this.experience+ "and the Salary is about " +calcArchSal());
    }
}

package AdvancedA5_JavaProgrammer;

public class Advanced_A5_JavaProgrammer {

    public static void main (String[] args){
    Programmer progi1 = new Programmer("programmer", "coding", 74000.0);
    Developer devi1 = new Developer("developer", "programming", 74000.00, "scrum",7000 );
    Architect archi = new Architect("architect", "management", 90000.00, "10 years",10000.00);
        System.out.println(progi1);
        System.out.println(devi1);
        System.out.println(archi);


    }

}

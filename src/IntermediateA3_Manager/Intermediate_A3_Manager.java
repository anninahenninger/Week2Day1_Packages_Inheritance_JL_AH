package IntermediateA3_Manager;/*A3: Manager, Clerk, Employee
Declare the following classes:
The Manager class, that extends Employee, describes a manager.
The Clerk class, that extends Employee, describes a clerk.
Define in each one of these classes all the needed methods and constructors and
check them using the given application.
The Employee class harbors name, age and hourlyRate properties, as well as toString() method.
Create it.
Check your classes using the following application:
public class Test
{
   public static void main(String args[])
  {
        Employee vec[] = {new Manager("Moshe", 52, 104), new Clerk("Daniel", 26, 110), new Manager("Ramy", 42,120), new Manager("Ronen", 34, 120)};
       double hours[] = {140,150,130,180};
        double total = 0;
        for(int index = 0; index < vec.length; index ++)
        {
            total += vec[index].salary(hours[index]);
            System.out.println(vec[index]);
       }
        System.out.println("The total payment of the employees is " + total);
   }
}*/

public class Intermediate_A3_Manager {

    public static void main (String[] args){

            Employee vec[] = {new Manager("Moshe", 52, 104), new Clerk("Daniel", 26, 110), new Manager("Ramy", 42,120), new Manager("Ronen", 34, 120)};
            double hours[] = {140,150,130,180};
            double total = 0;
            for(int index = 0; index < vec.length; index ++)
            {
                total += vec[index].salary(hours[index]);
                System.out.println(vec[index]);
            }
            System.out.println("The total payment of the employees is € " + total);
        }

    }


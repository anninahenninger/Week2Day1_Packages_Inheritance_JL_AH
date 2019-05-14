package BasicA1;/*A1: Person, Student

        Declare the Person class that describes a human and the Student class that extends Person.

        The attributes in each instance of type Person should include: name, age and id. The attributes in each instance of type Student should include, in addition to those that inherited from class Person, the attribute average.

        Each of the two classes should have declared the toString() method.

        You should check these two classes by instantiating them and invoking the toString method on each one of them.

        Add class Teacher extending Person. What could be additional fields describing a Teacher?*/

public class Basic_A1 {

    public static void main(String[] args) {
       Person p1 = new Person ("Otto", 23,001);
       Person p2 = new Person ("Claudine", 19,002);

       Student s1 = new Student("Simon", 27, 003, 2);

       Teacher t1 = new Teacher("Mr. Knowsall", 43, 004, "Math");

       System.out.println(t1.toString(t1.age));
       System.out.println(s1.toString(s1.avg));
       System.out.println(t1.toString(t1.id));


    }

}

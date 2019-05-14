public class Student extends Person{

    int avg = 0;

    public Student(String name, int age, int id, int avg){
        super(name, age, id);
        this.avg = avg;
    }
    public String toString( int value){
        return Integer.toString(value);
    }

}

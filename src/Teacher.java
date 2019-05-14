public class Teacher extends Person {

    public String subject;

    public Teacher (String name, int age, int id, String subject){
        super(name, age, id);
        this.subject = subject;
    }
    public String toString( int value){
        return Integer.toString(value);
    }
}

public class Person {

    public String name;
    public int age;
    public int id;

    public Person (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString( int value){
        return Integer.toString(value);
    }


}

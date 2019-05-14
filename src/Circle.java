public class Circle extends Shape {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return (int)(Math.pow(radius, 2) * Math.PI);
    }

}

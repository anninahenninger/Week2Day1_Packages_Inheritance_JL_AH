package IntermediateA2_Shape;

/**
 * Declare the following classes: the Rectangle class, that extends Shape, describes a simple rectangle.
 *
 * The Circle class, that extends Shape, describes a simple circle.
 *
 * The Shape class is given as follows:
 *
 * public abstract class Shape
 * {
 *    public abstract double area();
 *        public String toString()
 *         {
 *            return "The area is " + area();
 *        }
 *    }
 * }
 *
 * Check your classes using the following application:
 *
 * public class Test
 * {
 *    public static void main(String args[])
 *     {
 *         Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};
 *         for (int index = 0; index < vec.length; index ++)
 *          {
 *              System.out.println(vec[index].toString());
 *         }
 *    }
 * }
 *
 * Research the term “abstract classes in Java”
 */
public class Intermediate_A2_Shape {
    public static void main(String args[])
    {
        Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};
        for (int index = 0; index < vec.length; index ++)
        {
            System.out.println(vec[index].toString());
        }
    }

}

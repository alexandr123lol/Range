import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alexander on 20.10.2016.
 */
public class Main  {
    public static void main(String[] args) {
        Square square = new Square(50);
        Triangle triangle = new Triangle(3, 4, 6, 2, 8, 5);
        Rectangle rectangle = new Rectangle(20, 10);
        Circle circle = new Circle(25);
        Square square1 = new Square(3.5);
        double[] arrayArea = new double[]{square.getArea(), triangle.getArea(), rectangle.getArea(), circle.getArea(), square1.getArea()};
        maxArea(arrayArea);
    }

    public static void maxArea(double[] arrayArea) {

        double maxArea = arrayArea[0];
        int index = 1;


        for (int i = 0; i < arrayArea.length; ++i)
            if (maxArea < arrayArea[i]) {
                maxArea = arrayArea[i];
                index = i + 1;
            }

        System.out.println("Максимальная площадь равна " + maxArea + " У объекта поданного" + index);
    }

}


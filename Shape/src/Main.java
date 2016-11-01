import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alexander on 20.10.2016.
 */
public class Main {

     private static final double  EPSILON = 0.00001;

    public static void main(String[] args) {
        Square square = new Square(50);
        Triangle triangle = new Triangle(3, 4, 6, 2, 8, 5);
        Rectangle rectangle = new Rectangle(20, 10);
        Circle circle = new Circle(25);
        Square square1 = new Square(3.5);

        double[] arrayArea = new double[]{square.getArea(), triangle.getArea(), rectangle.getArea(), circle.getArea(), square1.getArea()};
        double[] arrayPerimeter = new double[]{square.getPerimeter(), triangle.getPerimeter(), rectangle.getPerimeter(),
                circle.getPerimeter(), square1.getPerimeter()};

        double maxArea = maxArea(arrayArea);
        double secondPerimeter = secondPerimeter(arrayPerimeter);

        if (maxArea-square.getArea()<EPSILON) {
            square.print();
        }else  if (maxArea-square1.getArea()<EPSILON) {
            square1.print();
        } else if (maxArea-rectangle.getArea()<EPSILON) {
            rectangle.print();
        } else if (maxArea-circle.getArea()<EPSILON) {
            circle.print();
        } else if (maxArea-triangle.getArea()<EPSILON) {
            triangle.print();
        } else {
            System.out.println("Ошибка");
        }

        if (secondPerimeter-square.getPerimeter()<EPSILON) {
            square.print();
        }else  if (secondPerimeter-square1.getPerimeter()<EPSILON) {
            square1.print();
        } else if (secondPerimeter-rectangle.getPerimeter()<EPSILON) {
            rectangle.print();
        } else if (secondPerimeter-circle.getPerimeter()<EPSILON) {
            circle.print();
        } else if (secondPerimeter-triangle.getPerimeter()<EPSILON) {
            triangle.print();
        } else {
            System.out.println("Ошибка");
        }

    }

    public static double maxArea(double[] arrayArea) {

        Arrays.sort(arrayArea);
        return arrayArea[arrayArea.length - 1];
    }

    public static double  secondPerimeter(double[] arrayPerimeter) {

        Arrays.sort(arrayPerimeter);
         return arrayPerimeter[1] ;
    }

}


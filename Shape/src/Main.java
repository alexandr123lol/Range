import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alexander on 20.10.2016.
 */
public class Main {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(50);
        shapes[1] = new Triangle(3, 4, 6, 2, 8, 5);
        shapes[2] = new Rectangle(20, 10);
        shapes[3] = new Circle(25);
        shapes[4] = new Square(1);


        System.out.println(maxArea(shapes).toString());
        System.out.println(secondPerimeter(shapes).toString());

    }

    public static Shape maxArea(Shape[] shapes) {

        Arrays.sort(shapes, new ShapeByAreaComparator());
        return shapes[shapes.length - 1];
    }

    public static Shape secondPerimeter(Shape[] shapes) {

        Arrays.sort(shapes, new ShapeByPerimeterComparator());
        return shapes[1];
    }
}



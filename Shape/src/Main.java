/**
 * Created by Alexander on 20.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(50);
        Triangle triangle = new Triangle(3, 4, 6, 2, 8, 10);
        Rectangle rectangle = new Rectangle(20, 1000);
        Circle circle = new Circle(50);
        Square square1 = new Square(3.5);
        maxArea(square,triangle,rectangle,circle,square1);
    }

    public static void maxArea(Shape square, Shape triangle, Shape rectangle, Shape circle, Shape square1) {
        double[] arrayArea = new double[]{square.getArea(), square1.getArea(), triangle.getArea(), rectangle.getArea(),circle.getArea()};
        double maxArea = arrayArea[0];
        int index = 0;

        for ( int i = 0; i < arrayArea.length; ++i) {
            if (maxArea<arrayArea[i]) {
                maxArea= arrayArea[i];
                 index = i;
            }
        }
        System.out.println("Максимальная площадь равна " +maxArea + " У объекта " + arrayArea[index]);
    }
}

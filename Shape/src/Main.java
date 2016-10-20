/**
 * Created by Alexander on 20.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(50);
        Triangle triangle = new Triangle(3, 4, 6, 2, 8, 5);
        Rectangle rectangle = new Rectangle(20, 10);
        Circle circle = new Circle(25);
        Square square1 = new Square(3.5);
        maxArea(square,triangle,rectangle,circle,square1);
    }

    public static void maxArea(Shape square, Shape triangle, Shape rectangle, Shape circle, Shape square1) {
        double[] arrayArea = new double[]{square.getArea(), triangle.getArea(), rectangle.getArea(),circle.getArea(), square1.getArea()};
        double maxArea = arrayArea[0];
        int index = 1;

        for ( int i = 0; i < arrayArea.length; ++i) {
            if (maxArea<arrayArea[i]) {
                maxArea= arrayArea[i];
                 index = i+1;
            }
        }
        
        System.out.println("Максимальная площадь равна " +maxArea + " У объекта поданного" + index);
    }
}

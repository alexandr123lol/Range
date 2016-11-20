import java.util.Comparator;

/**
 * Created by Alexander on 20.11.2016.
 */
public class ShapeByPerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getPerimeter() == o2.getPerimeter()) {
            return 0;
        }
        return o1.getPerimeter()>o2.getPerimeter()? 1:-1;
    }
}

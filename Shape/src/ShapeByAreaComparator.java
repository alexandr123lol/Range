import java.util.Comparator;

/**
 * Created by Alexander on 20.11.2016.
 */
public class ShapeByAreaComparator implements Comparator<Shape> {


    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getArea() > o2.getArea())
            return 1;
        else if (o1.getArea() < o2.getArea())
            return -1;
        else
            return 0;
    }
}

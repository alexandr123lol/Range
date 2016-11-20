import com.sun.javafx.geom.*;

/**
 * Created by Alexander on 20.10.2016.
 */
public class Triangle implements Shape {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private static double max(double... point) {
        double max = point[0];
        for (int i = 1; i < point.length; ++i) {
            if (point[i] > max) {
                max = point[i];
            }
        }
        return max;
    }

    private static double min(double... point) {
        double min = point[0];
        for (int i = 1; i < point.length; ++i) {
            if (point[i] < min) {
                min = point[i];
            }
        }
        return min;
    }

    private static double length(double x0, double y0, double x, double y) {
        return Math.sqrt((x0 - x) * (x0 - x) + (y0 - y) * (y0 - y));
    }

    @Override
    public double getWidth() {
        return max(x1, x2, x3) - min(x1, x2, x3);

    }

    @Override
    public double getHeight() {
        return max(y1, y2, y3) - min(y1, y2, y3);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - length(x1, y1, x2, y2)) * (p - length(x2, y2, x3, y3)) * (p - length(x3, y3, x1, y1)));
    }

    @Override
    public double getPerimeter() {
        return length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x3, y3, x1, y1);
    }


    @Override
    public int hashCode() {
        return (int)((x1+x2+x3+y1+y2+y3)/2)-100000;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle)) return false;
        Triangle t = (Triangle) o;
        return (o == this) || (x1 == t.x2&&x2==t.x2&&x3==t.x3&&y1==t.y1&&y2==t.y2&&y3==t.y3);
    }

    @Override
    public String toString() {
        return ("Треугольник со сторонами " + getWidth() + " " + getHeight() + " площадью и переиметром " + getArea() + " " + getPerimeter());
    }
}

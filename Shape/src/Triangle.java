import com.sun.javafx.geom.*;

/**
 * Created by Alexander on 20.10.2016.
 */
public class Triangle implements Shape {
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private double max(double... point) {
        double max = point[0];
        for (int i = 1; i < point.length; ++i) {
            if (point[i] > max) {
                max = point[i];
            }
        }
        return max;
    }

    private double min(double... point) {
        double min = point[0];
        for (int i = 1; i < point.length; ++i) {
            if (point[i] < min) {
                min = point[i];
            }
        }
        return min;
    }

    private static double length(double x0, double x, double y0, double y) {
        return Math.sqrt((x0 - x) * (x0 - x) + (y0 - y) * (y0 - y));
    }

    @Override
    public double getWidth() {
        return max(x1,x2,x3) - min(x1,x2,x3);

    }

    @Override
    public double getHeight() {
        return max(y1,y2,y3) - min(y1,y2,y3);
    }

    @Override
    public double getArea() {
        return getHeight()*getWidth()/2;
    }

    @Override
    public double getPerimeter() {
        return length(x1,x2,y1,y2) +length(x2,x3,y2,y3) +length(x3,x1,y3,y1);
    }
}

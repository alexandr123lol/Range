/**
 * Created by Alexander on 20.10.2016.
 */
public class Rectangle implements Shape {
    private double wigth;
    private double height;

    public Rectangle(double wigth, double height) {
        this.wigth = wigth;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return wigth;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return wigth*height;
    }

    @Override
    public double getPerimeter() {
        return (wigth+height)*2;
    }
}

/**
 * Created by Alexander on 20.10.2016.
 */
public class Rectangle implements Shape {
    private double wight;
    private double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return wight;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return wight * height;
    }

    @Override
    public double getPerimeter() {
        return (wight + height) * 2;
    }

    public void print() {
        System.out.println("Четырехугольник со сторонами "+getWidth()+" "+getHeight() + " площадью и переиметром "+getArea()+" "+getPerimeter());
    }
}

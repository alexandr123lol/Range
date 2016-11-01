/**
 * Created by Alexander on 20.10.2016.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getWidth() {
        return 2 * radius;
    }

    @Override
    public double getHeight() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Окружность  со сторонами "+getWidth()+" "+getHeight() + " площадью и переиметром "+getArea()+" "+getPerimeter());
    }
}

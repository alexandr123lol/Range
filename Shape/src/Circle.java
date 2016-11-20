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
    public int hashCode() {
        return (int) radius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) return false;
        Circle c = (Circle) o;
        return (o == this) || (radius == c.radius);
    }


    @Override
    public String toString() {
        return ("Окружность  со сторонами " + getWidth() + " " + getHeight() + " площадью и переиметром " + getArea() + " " + getPerimeter());
    }
}

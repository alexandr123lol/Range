/**
 * Created by Alexander on 20.10.2016.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }


    @Override
    public int hashCode() {
        return (int)(width*height)+1000000;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) o;
        return (o == this) || (width == r.width&&height==r.height);
    }


    @Override
    public String toString() {
        return ("Четырехугольник со сторонами " + getWidth() + " " + getHeight() + " площадью и переиметром " + getArea() + " " + getPerimeter());
    }
}


/**
 * Created by Alexander on 20.10.2016.
 */
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;

    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public int hashCode() {
        return (int)(side);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square)) return false;
        Square s = (Square) o;
        return (o == this) || (side == s.side);
    }

    @Override
    public String toString() {
        return ("Квадрат  со сторонами " + getWidth() + " " + getHeight() + " площадью и переиметром " + getArea() + " " + getPerimeter());
    }
}

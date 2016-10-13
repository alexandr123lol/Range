package rusnsakl;

/**
 * Created by Alexander on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Range range = new Range(2.3, 4.2);
        double number = 10;
        System.out.printf("Числовой диапазон длиной = %.2f  число %.2f принадлежит  ли диапазону: %s %n", range.getLength(), number, range.isInside(number));
        System.out.println(intersection());
    }

    public static String  intersection() {
        Range range = new Range(2.3, 4.2);
        Range range1 = new Range(3.1,4.2);
        double from = (range1.getFrom()> range.getFrom()) ? range1.getFrom() :  range.getFrom();
        double to = (range1.getTo() < range.getTo()) ? range1.getTo() : range.getTo();

        if (from > to) {
            return null;
        } else {
            return "["+from+".."+to+"]";
        }
    }
}

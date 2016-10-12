package Range;

/**
 * Created by Alexander on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Range range = new Range(2.3, 4.2);
        double number = 3.1;
        System.out.printf("Числовой диапазон длиной = %.2f  число %.2f принадлежит  ли диапазону: %s",range.getLength(),number,range.inInside(number));

    }
}

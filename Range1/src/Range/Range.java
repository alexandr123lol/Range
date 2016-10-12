package Range;

/**
 * Created by Alexander on 12.10.2016.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLenght() {
        return to - from;
    }

    public boolean inInside(double number) {
        if (from <= number || number <= to) {
            return true;
        }
        return false;
    }
}

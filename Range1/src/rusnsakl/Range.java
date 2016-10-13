package rusnsakl;

/**
 * Created by Alexander on 13.10.2016.
 */
public class Range {

    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean inInside(double number) {
        return from <= number && number <= to;

    }
}

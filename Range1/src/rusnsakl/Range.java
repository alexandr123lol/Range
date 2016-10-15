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

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return to - from;
    }


    public boolean isInside(double number) {
        return from <= number && number <= to;

    }


    public Range intersection(Range range) {


        double begin = (range.from > from) ? range.from : from;
        double end = (range.to < to) ? range.to : to;

        if (begin > end) {
            return null;
        }
        return new Range(begin, end);

    }
}





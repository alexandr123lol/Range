package rusnsakl;

/**
 * Created by Alexander on 13.10.2016.
 */
public class Range {

    private double from;
    private double to;
    private double begin;
    private double end;

    public Range(double from, double to, double begin, double end) {
        this.from = from;
        this.to = to;
        this.begin = begin;
        this.end = end;
    }

    public double getLength() {
        return to - from;
    }

    public double getLength2() {
        return end - begin;
    }

    public boolean isInside(double number) {
        return from <= number && number <= to;

    }

    public String  intersectionRange() {
        from = (begin > from) ? begin : from;
        to = (end < to) ? end : to;

        if (from > to) {
            return null;
        } else {
            return "["+from+".."+to+"]";
        }
    }




}

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

    public Range[] union(Range range) {


        if (range.isInside(from) && range.isInside(to)) {
            return new Range[]{new Range(range.from, range.to)};

        } else if (range.isInside((from))) {
            return new Range[]{new Range(range.from, to)};

        } else if (range.isInside(to)) {
            return new Range[]{new Range(from, range.to)};

        } else if (!((range.from <= from && from <= range.to) && (range.from <= to && to <= range.to))) {
            return new Range[]{new Range(range.from, range.to)};

        } else {

            if (range.from > from) {
                return new Range[]{new Range(from, to), new Range(range.from, range.to)};
            } else {
                return new Range[]{new Range(range.from, range.to), new Range(from, to)};
            }
        }

    }

    public Range[] difference(Range range) {

        if (!range.isInside(from) && !range.isInside(to)) {
            if (from < range.from) {
                return new Range[]{new Range(from, to), new Range(range.from, range.to)};
            } else {
                return new Range[]{new Range(range.from, range.to), new Range(from, to)};
            }

        } else if (range.from < from && to < range.to) {
            return new Range[0];

        } else if (range.isInside(from)) {
            return new Range[]{new Range(range.from, from)};

        } else if (range.isInside(to)) {
            return new Range[]{new Range(to, range.to)};

        } else {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};

        }
    }
}





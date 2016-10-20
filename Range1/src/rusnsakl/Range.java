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


        if (range.isInside(range.from) && range.isInside(range.to)) {
            return new Range[]{new Range(from, to)};

        } else if (range.isInside((range.from))) {
            return new Range[]{new Range(from, range.to)};

        } else if (range.isInside(range.to)) {
            return new Range[]{new Range(range.from, to)};

        } else if ((range.from <= from && from <= range.to) && (range.from <= to && to <= range.to)) {
            return new Range[]{new Range(range.from, range.to)};

        } else {
            Range[] array = new Range[2];
            if (range.from > from) {
                array[0] = new Range(from, to);
                array[1] = new Range(range.from, range.to);
                return array;
            } else {
                array[0] = new Range(range.from, range.to);
                array[1] = new Range(from, to);
                return array;
            }
        }

    }

    public Range[] difference(Range range) {
        Range[] array = new Range[2];
        if (!range.isInside(range.from) && !range.isInside(range.to)) {
            array[0] = new Range(from, to);
            return array;
        } else if (range.isInside(range.from)) {
            array[0] = new Range(from, range.from);
            return array;
        } else if (range.isInside(range.to)) {
            array[0] = new Range(range.to, to);
            return array;
        } else
            array[0] = new Range(from, range.from);
        array[1] = new Range(range.to, to);
        return array;
    }
}





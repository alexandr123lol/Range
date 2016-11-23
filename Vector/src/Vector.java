import java.awt.*;
import java.util.Arrays;


public class Vector {
    private static final double EPSILON = 0.0001;
    private int length;
    private double[] arrayVector;

    public Vector(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }
        this.length = length;
        arrayVector = new double[length];
        for (int i = 0; i < length; ++i) {
            this.arrayVector[i] = 0;
        }

    }

    public Vector(double[] arrayVector) {
        if (arrayVector.length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }
        this.arrayVector = arrayVector;
        length = arrayVector.length;
    }

    public Vector(int length, double[] arrayVector) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }

        this.length = length;
        this.arrayVector = new double[length];

        for (int i = 0; i < length; ++i) {
            if (i < arrayVector.length) {
                this.arrayVector[i] = arrayVector[i];
            } else {
                this.arrayVector[i] = 0;
            }
        }
    }


    public Vector(Vector other) {
        this(other.getLength(), other.getArrayVector());
    }

    public int getLength() {
        return length;
    }

    public double[] getArrayVector() {
        return arrayVector;
    }

    public int getSide() {
        return length;
    }

    public String toString() {
        return Arrays.toString(arrayVector);
    }

    public double[] sumVectors(Vector vector) {
        double sumVectors[] = new double[length];

        for (int i = 0; i < length; ++i) {
            sumVectors[i] = vector.arrayVector[i] + arrayVector[i];
        }
        return sumVectors;
    }

    public double[] subtractionVectors(Vector vector) {
        double subtractionVectors[] = new double[length];

        for (int i = 0; i < length; ++i) {
            subtractionVectors[i] = vector.arrayVector[i] - arrayVector[i];
        }
        return subtractionVectors;
    }

    public double[] multiplicationByScalar() {
        for (int i = 0; i < arrayVector.length; ++i) {
            arrayVector[i] *= length;
        }
        return arrayVector;
    }

    public double[] reversVector() {
        for (int i = 0; i < arrayVector.length; ++i) {
            arrayVector[i] *= -1;
        }
        return arrayVector;
    }

    public double lengthVector() {
        Arrays.sort(arrayVector);
        return Math.sqrt(arrayVector[0] * arrayVector[0] + arrayVector[length - 1] * arrayVector[length - 1]);
    }

    public double getVector(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Не корректно введен индекс вектора");
        }
        return arrayVector[index];
    }

    public void setVector(int index, double value) {
        if (index < 0) {
            throw new IllegalArgumentException("Не корректно введен индекс вектора");
        }
        arrayVector[index] = value;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += length;
        hash += Arrays.hashCode(arrayVector);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Vector v = (Vector) o;
        return (o == this) || (length - v.length <= EPSILON && Arrays.equals(arrayVector, v.arrayVector));
    }

    public static Vector sumVector(Vector v1, Vector v2) {
        int length;
        if (v1.length > v2.length) {
            length = v1.length;
            v2 = new Vector(length, v2.arrayVector);
        } else {
            length = v2.length;
            v1 = new Vector(length, v1.arrayVector);
        }

        Vector newVector = new Vector(length);
        for (int i = 0; i < length; ++i) {
            newVector.arrayVector[i] = Math.sqrt(v1.arrayVector[i] * v1.arrayVector[i] + v2.arrayVector[i] * v2.arrayVector[i]);
        }

        return newVector;
    }

    public static Vector differenceVector(Vector v1, Vector v2) {
        int length;
        if (v1.length > v2.length) {
            length = v1.length;
            v2 = new Vector(length, v2.arrayVector);
        } else {
            length = v2.length;
            v1 = new Vector(length, v1.arrayVector);
        }

        Vector newVector = new Vector(length);
        for (int i = 0; i < length; ++i) {
            newVector.arrayVector[i] = Math.sqrt(v1.arrayVector[i] * v1.arrayVector[i] - v2.arrayVector[i] * v2.arrayVector[i]);
        }

        return newVector;
    }

    public static Vector scalarProducteVector(Vector v1, Vector v2) {
        int length;
        if (v1.length > v2.length) {
            length = v1.length;
            v2 = new Vector(length, v2.arrayVector);
        } else {
            length = v2.length;
            v1 = new Vector(length, v1.arrayVector);
        }

        Vector newVector = new Vector(length);
        for (int i = 0; i < length; ++i) {
            newVector.arrayVector[i] = Math.abs(v1.arrayVector[i]) * Math.abs(v2.arrayVector[i]);
        }

        return newVector;
    }

}



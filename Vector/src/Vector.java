import java.awt.*;
import java.util.Arrays;


public class Vector {
    private static final double EPSILON = 0.0001;

    private double[] arrayVector;

    public Vector(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина, меньше или равна  нуля");
        }

        arrayVector = new double[length];
        for (int i = 0; i < length; ++i) {
            this.arrayVector[i] = 0;
        }

    }

    public Vector(double[] arrayVector) {
        if (arrayVector.length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина, меньше или равна нуля");
        }
        this.arrayVector = Arrays.copyOf(arrayVector, arrayVector.length);

    }

    public Vector(int length, double[] arrayVector) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не корректная  длина, меньше  или равна нуля");
        }
       final double[] array = Arrays.copyOf(arrayVector, arrayVector.length);
         this.arrayVector = array;

    }


    public Vector(Vector other) {
        this(other.getArrayVector());
    }


    public double[] getArrayVector() {
        return arrayVector;
    }

    public int getSide() {
        return arrayVector.length;
    }

    public String toString() {
        return Arrays.toString(arrayVector);
    }

    public void sumVectors(Vector vector) {
        int length;
        if (arrayVector.length > vector.getSide()) {
            length = arrayVector.length;
            vector = new Vector(length,vector.arrayVector);
        } else {
            length = vector.getSide();
            arrayVector = Arrays.copyOf(arrayVector,length);
        }

        for (int i = 0; i < length; ++i) {
            arrayVector[i] = Math.sqrt(vector.arrayVector[i] * vector.arrayVector[i] + arrayVector[i] * arrayVector[i]);
        }

    }

    public void subtractionVectors(Vector vector) {
        int length;
        if (arrayVector.length > vector.getSide()) {
            length = arrayVector.length;
            vector = new Vector(length,vector.arrayVector);
        } else {
            length = vector.getSide();
            arrayVector = Arrays.copyOf(arrayVector,length);
        }

        for (int i = 0; i < length; ++i) {
            arrayVector[i] += vector.arrayVector[i] * vector.arrayVector[i] - arrayVector[i] * arrayVector[i];
        }

    }

    public void multiplicationByScalar(int x) {
        for (int i = 0; i < arrayVector.length; ++i) {
            arrayVector[i] *= x;
        }
        System.out.println(Arrays.toString(arrayVector));
    }

    public void reversVector() {

        multiplicationByScalar(-1);
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < arrayVector.length; ++i) {
            sum += arrayVector[i] * arrayVector[i];
        }
        return Math.sqrt(sum);
    }

    public void getVectorElement(int index) {

        try {
            System.out.println(arrayVector[index]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setVectorElement(int index, double value) {

        try {
            arrayVector[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int hashCode() {
        int hash = 1;
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
        return (o == this) || (Arrays.equals(arrayVector, v.arrayVector));
    }

    public static Vector sumVector(Vector v1, Vector v2) {
        v1.sumVectors(v2);
        return v1;
    }

    public static Vector differenceVector(Vector v1, Vector v2) {
        v1.subtractionVectors(v2);
        return v1;
    }

    public static double scalarProducteVector(Vector v1, Vector v2) {
        int length;
        if (v1.getSide() > v2.getSide()) {
            length = v1.getSide();
            v2 = new Vector(length, v2.arrayVector);
        } else {
            length = v2.getSide();
            v1 = new Vector(length, v1.arrayVector);
        }

        double scalar = 0;

        for (int i = 0; i < length; ++i) {
            scalar += Math.abs(v1.arrayVector[i]) * Math.abs(v2.arrayVector[i]);
        }

        return scalar;
    }

}
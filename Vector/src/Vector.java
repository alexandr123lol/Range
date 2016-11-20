import java.util.Arrays;

/**
 * Created by Alexander on 04.11.2016.
 */
public class Vector {
    private int length;
    private double[] arrayVector;

    public Vector(int length) {
        if (length<=0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }
        this.length = length;
        arrayVector = new double[length];
        for (int i = 0; i < length; ++i) {
            this.arrayVector[i] = 0;
        }

    }

    public Vector(double[] arrayVector) {
        if (arrayVector.length<=0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }
        this.arrayVector = arrayVector;
        length = arrayVector.length;
    }

    public Vector(int length, double[] arrayVector) {
        if (length<=0) {
            throw new IllegalArgumentException("Не корректная  длина");
        }

        this.length = length;
        this.arrayVector = new double[length];

        for (int i = 0; i < length; ++i) {
            if (i< arrayVector.length) {
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
        for (int i = 0; i<arrayVector.length;++i) {
            arrayVector[i]*=length;
        }
        return arrayVector;
    }

    public double[] reversVector() {
        for (int i = 0; i<arrayVector.length;++i) {
            arrayVector[i]*=-1;
        }
        return arrayVector;
    }

    public  double lengthVector() {
        Arrays.sort(arrayVector);
        return Math.sqrt(arrayVector[0]*arrayVector[0]+arrayVector[length-1]*arrayVector[length-1]);
    }



}

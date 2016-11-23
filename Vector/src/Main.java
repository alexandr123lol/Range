/**
 * Created by Alexander on 04.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(new Vector(10, new  double[]{4,6,10,13,16,1,-20,-30}));
        Vector vector1 = new Vector(new double[]{0,0,0,-6,-10,-40,16,18,20});
        Vector vector2 = Vector.sumVector(vector,vector1);
        System.out.println(vector2.toString());
    }
}

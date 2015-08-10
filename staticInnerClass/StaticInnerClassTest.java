package staticInnerClass;

/**
 * Created by LLL on 15/8/10.
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i=0;i<d.length;i++){
            d[i] = 100*Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("The min value is: "+p.getFirst());
        System.out.println("The max value is: "+p.getSecond());
    }


}
class ArrayAlg {

    public static class Pair {
        private double first;
        private double second;

        public Pair(double f,double s){
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

    }

    public static Pair minmax(double[] d) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double v : d) {
            if (v > max) max = v;
            if (v < min) min = v;
        }
        return new Pair(min,max);
    }
}
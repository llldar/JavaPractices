package pair1;

/**
 * Created by LLL on 15/8/14.
 */
public class ArrayAlg {

    public static Pair<String> minmax(String[] a){
        if (a == null || a.length == 0){
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (String anA : a) {
            if (min.compareTo(anA) > 0) min = anA;
            if (max.compareTo(anA) < 0) max = anA;
        }
        return new Pair<>(min,max);
    }
}

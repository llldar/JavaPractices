package pair2;

import pair1.Pair;

/**
 * Created by LLL on 15/8/15.
 */
public class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (T anA : a){
            if (min.compareTo(anA) > 0) min = anA;
            if (max.compareTo(anA) <0) max = anA;
        }
        return new Pair<>(min,max);
    }

}

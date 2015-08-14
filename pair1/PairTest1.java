package pair1;

/**
 * Created by LLL on 15/8/14.
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("Min = "+mm.getFirst());
        System.out.println("Max = "+mm.getSecond());
    }
}

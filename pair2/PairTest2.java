package pair2;

import pair1.Pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by LLL on 15/8/15.
 */
public class PairTest2 {
    public static void main(String[] args){
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1906, Calendar.DECEMBER,9),//G.Hopper
                new GregorianCalendar(1815,Calendar.DECEMBER,10),//A.Lovelace
                new GregorianCalendar(1903,Calendar.DECEMBER,3),//J.von Neumann
                new GregorianCalendar(1910,Calendar.JUNE,22),//K.Zuse
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = "+mm.getFirst().getTime());
        System.out.println("Max = "+mm.getSecond().getTime());
    }
}

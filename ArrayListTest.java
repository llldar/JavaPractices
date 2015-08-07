/**
 * Created by LLL on 15/8/6.
 */
import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<Employee>();

        staff.add(new Employee("Jack",21,10000,"Tech"));
        staff.add(new Employee("Rose",22,12000,"Fiance"));
        staff.add(new Employee("Tom",27,18000,"Manage"));

        System.out.println("Here are the staff information:");
        for (Employee e: staff){
            System.out.println(e.toString());
        }

    }
}

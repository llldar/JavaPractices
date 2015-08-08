package Employment;

import java.util.Arrays;

/**
 * Created by LLL on 15/8/7.
 */
public class EmployeeSortTest {

    public static void main(String... args) {
        Employee[] staff= new Employee[4];

        Employee temp = new Employee("Jack",21,10000,"Tech");
        staff[0] = temp;
        staff[1] = new Employee("Rose",22,19000,"Fiance");
        staff[2] = new Employee("Tom",27,18000,"Manage");
        try {
            staff[3] = temp.clone();
//            staff[3] = temp;//to see how this would affect the result
            staff[3].setSalary(20000);
        }catch (Exception e){
            System.err.println("This object is not cloneable");
            e.printStackTrace();
        }

        Employee[] staffs = staff.clone();//array default clone method
        staffs[3].setSalary(90000);//see the effect here
        System.out.println("The original:");
        for (Employee e:staffs) {
            System.out.println(e.toString());
        }

        System.out.println("The sorted:");
        Arrays.sort(staff);
        for (Employee e:staff) {
            System.out.println(e.toString());
        }
    }
}

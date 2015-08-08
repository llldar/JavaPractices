package Employment;

/**
 * Created by LLL on 15/8/6.
 */
public class Employee extends Human implements Comparable,Cloneable{
    private static int nextId = 1;
    private double salary;
    private String department;
    private int id;

    private void setId(){
        this.id = nextId++;
    }
    public Employee(String name,int age,double salary,String department){
        super(name,age);
        setId();
        this.salary = salary;
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getName() {
        return department+super.getName();
    }

    @Override
    public String toString() {
        return "Employment.Employee#"+id+" "+super.toString()+",work in department "
                +department+",having a salary of "+salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee temp = (Employee)o;
        return Double.compare(this.salary,temp.salary);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee)super.clone();
        cloned.salary = salary;
        cloned.department = department;
        cloned.id = id;
        return cloned;
    }
}

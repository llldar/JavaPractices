/**
 * Created by LLL on 15/8/6.
 */
public class Human implements Cloneable{
    private String name;
    private int age;

    public Human(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+","+"age "+ age;
    }
    @Override
    public Human clone() throws CloneNotSupportedException {
        Human cloned = (Human) super.clone();
        cloned.name = name;
        cloned.age = age;
        return cloned;
    }
}

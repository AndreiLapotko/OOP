package Data;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<String> disciples;

    public Teacher(String name, int age, List<String> disciples) {
        this.name = name;
        this.age = age;
        this.disciples = disciples;

    }

    public List<String> getDisciples() {
        return disciples;
    }

    public void setDisciples(ArrayList<String> disciples) {
        disciples = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "disciples=" + disciples +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

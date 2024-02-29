import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Group implements Iterable<Student>{
    private ArrayList<Student> students;
    private int number;
    static Random r = new Random();

    public Group(ArrayList<Student> students) {
        this.students = students;
        this.number = r.nextInt(100, 999);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                '}';
    }
}

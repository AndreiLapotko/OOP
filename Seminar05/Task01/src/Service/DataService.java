package Service;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public DataService() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void create(User user) {
        if (user instanceof Student) {
            int id = students.size();
            Student student = new Student(user.getName(), user.getAge());
            student.setId(id + 1);
            students.add(student);
        } else if (user instanceof Teacher) {
            Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
            teachers.add(teacher);
        }

    }

    public void read(boolean bool) { // true student
        if (bool) {
            System.out.println(students);
        } else if (!bool) {
            System.out.println(teachers);
        }
    }
}

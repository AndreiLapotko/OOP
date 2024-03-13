/*
* Создать package – service. Работу продолжаем в нем
2. Создать класс DataService с методами в по управлению сущностями User (create, read) и агрегирующий всех пользователей заведенных в системе
3. StudentId должны быть созданы по алгоритму – максимальный id в коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор элементов и instanceOf*/

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
//            Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
            Teacher teacher = new Teacher(user.getName(), user.getAge(), ((Teacher) user).getDisciples());
            teachers.add(teacher);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void read(boolean flag) { // true student
        if (flag) {
            System.out.println(students);
        } else if (!flag) {
            System.out.println(teachers);
        }
    }
}

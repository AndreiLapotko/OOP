package View;

import Data.Student;
import Data.User;
import Service.DataService;

import java.util.List;

public class StudentView {
    private DataService dataService;

    public StudentView(DataService dataService) {
        this.dataService = dataService;
    }


    public void printStudent(String name) {
        List<Student> students = dataService.getStudents();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }
}

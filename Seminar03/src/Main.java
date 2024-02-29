/*
* - Создать класс Студент
- Создать класс УчебнаяГруппа
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты
*
* - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
- Реализовать контракт compareTo () со сравнением по какому-либо параметру (пример studentId)
*
* - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
*
*
* ДЗ:— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Модифицировать Comparator для студента таким образом, что бы была возможность сравнения оценок студентов(предвадительно необходимо добавить соотвествующее поле в Student)
*  */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Q", 20, "Chemistry", 4.5);
        Student s2 = new Student("A", 20, "Literature", 3.8);
        Student s5 = new Student("A", 25, "Aerodynamics", 5.0);
        Student s6 = new Student("A", 30, "Cybernetics", 4.6);
        Student s3 = new Student("B", 15, "Math", 4.7);
        Student s4 = new Student("C", 35, "Physics", 4.85);

        ArrayList<Student> students01 = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));
        ArrayList<Student> students02 = new ArrayList<>();
        ArrayList<Student> students03 = new ArrayList<>();
        ArrayList<Student> students04 = new ArrayList<>();

        students02.add(new Student());
        students02.add(new Student());
        students02.add(new Student());
        students03.add(new Student());
        students03.add(new Student());
        students03.add(new Student());
        students03.add(new Student());
        students04.add(new Student());
        students04.add(new Student());

        Group group01 = new Group(students01);
        Group group02 = new Group(students02);
        Group group03 = new Group(students03);
        Group group04 = new Group(students04);

        Stream stream001 = new Stream(new ArrayList<>(List.of(group01, group02)));
        Stream stream002 = new Stream(new ArrayList<>(List.of(group01, group02, group03, group04)));
        Stream stream003 = new Stream(new ArrayList<>(List.of(group04)));

        for (Student student : group02) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : group03) {
            System.out.println(student);
        }
        ArrayList<Stream> streams = new ArrayList<>(List.of(stream001, stream002, stream003));
        streams.sort(new StreamComparator());
        for (Stream st : streams) {
            System.out.println(st);
        }
        students01.sort(new StudentComparator());
        for (Student student : students01) {
            System.out.println(student);
        }
    }
}

/*
* - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
* */

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        String s1 = o1.getName() + o1.getAge();
//        String s2 = o2.getName() + o2.getAge();
//        return s1.compareTo(s2);
        return Double.compare(o1.getGPA(), o2.getGPA());
    }
}

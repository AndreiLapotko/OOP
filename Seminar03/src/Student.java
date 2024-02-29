/*
* - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
- Реализовать контракт compareTo () со сравнением по какому-либо параметру (пример studentId)

* - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
* * */

import java.util.Random;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String spec;
    private double GPA;

    static Random r = new Random();
    static int number = 1;

    public Student(String name, int age, String spec, double GPA) {
        this.name = name;
        this.age = age;
        this.spec = spec;
        this.GPA = GPA;
    }

    public Student() {
        this.name = "John" + number++;
        this.age = r.nextInt(18, 50);
        this.spec = "Agriculture";
        this.GPA = Math.round((r.nextDouble(3.0, 5.0)) * 10.0) / 10.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spec='" + spec + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);

    }
}

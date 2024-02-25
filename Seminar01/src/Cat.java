public class Cat {
    private String name;
    private int age;
//    public void meow() {
//        String meow = "meow";
//        System.out.println(meow);
//    }
    public void purr() {
        System.out.println("Purring");
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

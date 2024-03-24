public class Dog extends Mammals {
//    private String name;
    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Бегаем и прыгаем.");
    }

    @Override
    public void sound() {
        System.out.println("Лаем.");
    }
}

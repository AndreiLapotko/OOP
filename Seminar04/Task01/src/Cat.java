public class Cat extends Mammals {

    public Cat(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Бегаем");
    }

    @Override
    public void sound() {
        System.out.println("Мяукаем");
    }
}

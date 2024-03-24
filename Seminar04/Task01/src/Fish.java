public class Fish extends Fishes{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Плаваем");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }
}

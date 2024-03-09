import java.util.Random;

public class Human extends Actor {
    static Random r = new Random();

    public Human(String name) {
        this.name = name;
    }

    public Human() {
        this("John " + r.nextInt(1, 100));
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}

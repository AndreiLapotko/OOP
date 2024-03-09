/*
* Создайте обобщенный класс Product<T>, который представляет товар в интернет-магазине. Каждый товар должен иметь параметр типа T для его названия.*/
public class Product<T> {
    private T name;
    private double price;

    public Product(T name, double price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}

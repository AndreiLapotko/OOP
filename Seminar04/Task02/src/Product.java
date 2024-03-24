/*
* Создайте обобщенный класс Product<T>, который представляет товар в интернет-магазине. Каждый товар должен иметь параметр типа T для его названия.*/
public class Product<T> {
    ViewProductInfo view;

    public void setView(ViewProductInfo view) {
        this.view = view;
    }

    private T name;
    private double price;

    public Product(T name, double price, ViewProductInfo view) {
        this.name = name;
        this.price = price;
        this.view = view;
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

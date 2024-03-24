import java.util.ArrayList;
import java.util.List;

/*
* Создайте класс OnlineStore, который будет представлять интернет-магазин. У этого класса должны быть методы для добавления товаров и оформления заказов.
Добавьте метод для вывода информации о всех заказах в магазине*/
public class OnlineStore<T, K, V> {
    private List<Product<T>> products;

    public List<Product<T>> getProducts() {
        return products;
    }

    private int orderCounter;
    private List<Order<K, V>> listOrders;

    public OnlineStore() {
        products = new ArrayList<>();
        listOrders = new ArrayList<>();
        orderCounter = 0;
    }

    void addProd(Product<T> product) {
        products.add(product);
    }
    void createOrder(Order<K, V> order) {
        listOrders.add(order);
        orderCounter++;
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "listOrder=" + listOrders +
                '}';
    }
}

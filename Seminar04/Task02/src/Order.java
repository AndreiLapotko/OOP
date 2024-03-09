import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* Создайте обобщенный класс Order<K, V>, который представляет заказ в интернет-магазине. Каждый заказ должен содержать параметры типов K для номера заказа и V для списка товаров.*/
public class Order<K, V> {
    private K orderNumber;
    private List<V> listProd = new ArrayList<>();

    public Order(K orderNumber) {
        this.orderNumber = orderNumber;
//        this.listProd = listProd;
    }

    public K getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(K orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<V> getListProd() {
        return listProd;
    }

    public void setListProd(V product) {
        listProd.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", listProd=" + listProd +
                '}';
    }
}

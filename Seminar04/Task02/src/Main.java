/*
* Создайте обобщенный класс Product<T>, который представляет товар в интернет-магазине. Каждый товар должен иметь параметр типа T для его названия.
Создайте обобщенный класс Order<V>, который представляет заказ в интернет-магазине. Каждый заказ должен содержать параметры типов K для номера заказа и V для списка товаров.
Создайте класс OnlineStore, который будет представлять интернет-магазин. У этого класса должны быть методы для добавления товаров и оформления заказов.
Добавьте метод для вывода информации о всех заказах в магазине*/

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OnlineStore<String, Integer, String> store = new OnlineStore<>();
        store.addProd(new Product<>("Штаны", 150.0, new ConsoleProductInfo()));
        store.addProd(new Product<>("Носки", 50.0, new WinProductInfo()));
        System.out.println(store.getProducts());

        Order<Integer, String> order1 = new Order<>(1111);
        Order<Integer, String> order2 = new Order<>(57);
        order1.setListProd("Штаны");
        order2.setListProd("Носки");
        store.createOrder(order1);
        store.createOrder(order2);

        System.out.println(store);
    }
}

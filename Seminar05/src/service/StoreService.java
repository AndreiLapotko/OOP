package service;

import model.Shwarma;
import model.Orders;

public class StoreService {
    Orders orders = new Orders();
    public void addOrder(Shwarma shwarma) {
        if (shwarma.getContains() == null || shwarma.getCost() <= 0) {
            System.out.println("Некорректные данные!");
        } else {
            orders.add(shwarma);
        }
//        System.out.println("добавили в onlineStore " + shwarma);
    }

    public void seeOrders() {
        orders.getArrayList();
    }
}

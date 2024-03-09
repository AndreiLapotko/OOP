package controller;

import model.Orders;
import model.Shwarma;

import java.util.ArrayList;

public class OnlineStoreController {
    private Orders orders;

    public OnlineStoreController() {
        orders = new Orders();
    }

    public void addOrder(Shwarma shwarma) {
        orders.add(shwarma);
        System.out.println("добавили в onlineStore " + shwarma);
    }

    public void seeOrders() {
        orders.getArrayList();
    }

    @Override
    public String toString() {
        return "OnlineStoreController{" +
                "orders=" + orders +
                '}';
    }
}
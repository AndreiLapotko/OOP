package controller;

import model.Orders;
import model.Shwarma;
import service.StoreService;

import java.util.ArrayList;

public class OnlineStoreController {
//    private Orders orders;
    private final StoreService storeService = new StoreService();
    public OnlineStoreController() {
//        orders = new Orders();

    }

    public void addOrder(Shwarma shwarma) {
//        orders.add(shwarma);
//        System.out.println("добавили в onlineStore " + shwarma);
        storeService.addOrder(shwarma);
    }

    public void seeOrders() {
        storeService.seeOrders();
    }

//    @Override
//    public String toString() {
//        return "OnlineStoreController{" +
//                "orders=" + orders +
//                '}';
//    }
}
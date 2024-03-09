import controller.OnlineStoreController;
import model.Orders;
import model.Shwarma;
import view.StoreView;

public class Main {
    public static void main(String[] args) {
        OnlineStoreController onlineStoreController =new OnlineStoreController();
        onlineStoreController.addOrder(new Shwarma(200, "сырный лаваш и много овощей/мяса"));
        StoreView storeView = new StoreView(onlineStoreController);
        System.out.println("////////////////");
        storeView.showOrders();

        System.out.println();

    }
}
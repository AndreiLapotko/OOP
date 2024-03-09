package view;

import controller.OnlineStoreController;

public class StoreView {
    private OnlineStoreController onlineStoreController;

    public StoreView(OnlineStoreController onlineStoreController) {
        this.onlineStoreController = onlineStoreController;
    }

    public void showOrders(){
        onlineStoreController.seeOrders();
    }

    @Override
    public String toString() {
        return "StoreView{" +
                "onlineStoreController=" + onlineStoreController +
                '}';
    }
}
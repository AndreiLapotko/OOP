import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private ArrayList<Product> products;

    public void initProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Product getProduct(String prodName) {
        for (Product p : products) {
            if (p.getName().equals(prodName)) {
                return p;
            }
        }
        return null;
    }
}

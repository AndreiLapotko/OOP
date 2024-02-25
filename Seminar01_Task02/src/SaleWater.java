import java.util.ArrayList;

public class SaleWater implements VendingMachine {
    private ArrayList<Product> bottleOfWater;

    public void initProducts(ArrayList<Product> product) {
        this.bottleOfWater = product;
    }

    @Override
    public Product getProduct(String prodName) {
        for (Product p : bottleOfWater) {
            if (p.getName().equals(prodName)) {
                return p;
            }
        }
        return null;
    }
}

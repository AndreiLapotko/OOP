import java.util.ArrayList;

public class SaleBurger implements VendingMachine{
    private ArrayList<Product> burger;

    public void initProducts(ArrayList<Product> product) {
        this.burger = product;
    }
    @Override
    public Product getProduct(String prodName) {
        for (Product p : burger) {
            if (p.getName().equals(prodName)) {
                return p;
            }
        }
        return null;
    }
}

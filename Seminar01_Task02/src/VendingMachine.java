import java.util.ArrayList;

interface VendingMachine {
//    private ArrayList<Product> products;

//    abstract void initProducts(ArrayList<Product> product);

    abstract Product getProduct(String prodName);
//    Product getProduct(String prodName) {
//        for (Product p : products) {
//            if (p.getName().equals(prodName)) {
//                return p;
//            }
//        }
//        return null;
//    }
}

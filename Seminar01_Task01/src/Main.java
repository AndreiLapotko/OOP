/*
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 * */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new Product("Хлеб", 50.0));
        prods.add(new Product("Молоко", 100.0));
        prods.add(new Product("Колбаса", 150.0));
        prods.add(new Product("Сыр", 250.0));

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Сыр"));
    }
}

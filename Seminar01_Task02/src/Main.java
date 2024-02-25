/* Задача 1.
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 * */


/*Задача 2.
* Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
* */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<BottleOfWater> water = new ArrayList<>();
        ArrayList<Product> water = new ArrayList<>();
        water.add(new BottleOfWater("Вода", 20.0));
        water.add(new BottleOfWater("Вино", 60.0));
        water.add(new BottleOfWater("Сидр", 50.0));
        water.add(new BottleOfWater("Квас", 40.0));

        ArrayList<Product> burger = new ArrayList<>();
        burger.add(new Burger("Бургер", 100));
        burger.add(new Burger("Завертон", 150));
        burger.add(new Burger("Беляш", 200));

        SaleWater saleWaterMachine = new SaleWater();
        saleWaterMachine.initProducts(water);
        System.out.println(saleWaterMachine.getProduct("Вино"));

        SaleBurger saleBurgerMachine = new SaleBurger();
        saleBurgerMachine.initProducts(burger);
        System.out.println(saleBurgerMachine.getProduct("Беляш"));
    }
}

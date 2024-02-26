import java.util.ArrayList;

/*
1) Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2) Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре.
3) В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе.
4) Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре.
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<ExtraHotDrinks> hotDrinks = new ArrayList<>();
        hotDrinks.add(new ExtraHotDrinks("Кофе", 0.3, 60));
        hotDrinks.add(new ExtraHotDrinks("Чай", 0.25, 70));
        hotDrinks.add(new ExtraHotDrinks("Какао", 0.35, 55));
        hotDrinks.add(new ExtraHotDrinks("Глинтвейн", 0.5, 50));

        HotDrinksSaleMachine hotDrinksSaleMachine = new HotDrinksSaleMachine();
        hotDrinksSaleMachine.initDrinks(hotDrinks);

        System.out.println(hotDrinksSaleMachine.getDrink("Чай"));
        System.out.println(hotDrinksSaleMachine.getDrink(50));
        System.out.println(hotDrinksSaleMachine.getDrink(0.35));
        System.out.println(hotDrinksSaleMachine.getDrink("Кофе", 0.3, 60));
    }
}

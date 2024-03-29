/*
* Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдает заказы)*/
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human h01 = new Human();
        Human h02 = new Human("Alex");
        Human h03 = new Human("Ustas");
        market.acceptToMarket(h01);
        market.acceptToMarket(h02);
        market.acceptToMarket(h03);
        System.out.println(h01);
        System.out.println(market.people);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    Queue<Human> humanQueue = new LinkedList<>();
    List<Human> people = new ArrayList<>();

    @Override
    public void acceptToMarket(Human human) {
        people.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        people.remove(human);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override
    public void takeInQueue() {
        takeOrders();
    }
    @Override
    public void releaseFromQueue(Human human) {
        giveOrders();
    }
    @Override
    public void takeOrders(Human human) {
        humanQueue.add(human);
    }

    @Override
    public void giveOrders() {
        humanQueue.remove();
    }


}

import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {
        acceptToMarket();
        releaseFromMarket();
    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}

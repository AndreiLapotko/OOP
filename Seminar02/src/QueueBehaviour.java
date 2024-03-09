public interface QueueBehaviour {
    void takeInQueue();
    void takeOrders(Human human);
    void giveOrders();
    void releaseFromQueue(Human human);
}

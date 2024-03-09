public abstract class Actor  implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}

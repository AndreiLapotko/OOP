public class ExtraHotDrinks extends HotDrink {
    private int temperature;

    public ExtraHotDrinks(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.getName() +
                ", Объём, л: " +  super.getVolume() +
                ", Температура, С: " +  temperature;
    }
}

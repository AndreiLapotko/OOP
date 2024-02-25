public class ExtraHotDrinks extends HotDrink {
    private double temperature;

    public ExtraHotDrinks(String name, int volume, double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.getName() +
                ", Объём, мл: " +  super.getVolume() +
                ", Температура, С: " +  temperature;
    }
}

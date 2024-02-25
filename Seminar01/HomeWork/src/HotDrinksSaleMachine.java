import java.util.ArrayList;

public class HotDrinksSaleMachine implements VendingMachine{
    private ArrayList<ExtraHotDrinks> hotDrinks;
    @Override
    public ExtraHotDrinks getDrink(String name) {
        for (ExtraHotDrinks drink: hotDrinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    public ExtraHotDrinks getDrink(int volume) {
        for (ExtraHotDrinks drink: hotDrinks) {
            if (drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }

    public ExtraHotDrinks getDrink(double temperature) {
        for (ExtraHotDrinks drink: hotDrinks) {
            if (drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }

    public ExtraHotDrinks getDrink(String name, int volume, double temperature) {
        for (ExtraHotDrinks drink: hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }

    public void initDrinks(ArrayList<ExtraHotDrinks> drinks) {
        this.hotDrinks = drinks;
    }
}

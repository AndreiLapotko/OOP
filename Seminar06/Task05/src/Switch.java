/*
* Здесь класс Switch жестко зависит от класса LightBulb, нарушая DIP. Чтобы следовать DIP, зависимость должна быть инвертирована с использованием интерфейсов или абстракций.*/
interface Switchable {
    public void turnOn();

    public void turnOff();
}

class LightBulb implements Switchable{
    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {
    }
}

class Switch {
    private Switchable bulb;

    public Switch(Switchable device) {
        this.bulb = device;
    }

    public void operate() {
// Работа с выключателем
        bulb.turnOn();
        bulb.turnOff();
    }
}

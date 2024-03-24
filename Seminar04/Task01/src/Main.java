/*
 * Задача: Напишите обобщенный класс VetClinic, который представляет собой ветеринарную клинику для различных видов животных. Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов. Продемонстрируйте использование этого класса для работы с пациентами - собаками, кошками и другими животными.*/

// В рамках SRP создана иерархия классов с разбивкой по назначениям

// ISP - интерфейсы разделены по функционалу, разные классы имплементируют тольк необходимые интерфейсы

// DIP - модули высокого уровня не зависят от модулей низкого уровня
public class Main {
    public static void main(String[] args) {
        VetClinic<Animals> vetClinic = new VetClinic<>();
        Cat cat1 = new Cat("Tom");
        Cat cat3 = new Cat("Ozzi");

        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Puppy");

        vetClinic.add(cat1);
        vetClinic.add(new Cat("Bazilio"));
        vetClinic.add(dog1);
        vetClinic.add(dog2);
        vetClinic.add(new Fish("Vanda"));
        System.out.println(vetClinic);
        vetClinic.help(cat1);
        vetClinic.help(dog1);
        vetClinic.setClient(cat3);
        vetClinic.add(cat3);
        System.out.println(vetClinic);
        System.out.println(vetClinic.getClient());
        cat3.sound();
    }
}

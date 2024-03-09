/*
 * Задача: Напишите обобщенный класс VetClinic, который представляет собой ветеринарную клинику для различных видов животных. Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов. Продемонстрируйте использование этого класса для работы с пациентами - собаками, кошками и другими животными.*/
public class Main {
    public static void main(String[] args) {
        VetClinic<Animal> vetClinic = new VetClinic<>();
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Bazilio");

        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Puppy");

        vetClinic.add(cat1);
        vetClinic.add(cat2);
        vetClinic.add(dog1);
        vetClinic.add(dog2);
        System.out.println(vetClinic);
        vetClinic.help(cat2);
        vetClinic.help(dog1);
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Кузя");
        cat.setAge(5);
        System.out.println(cat);
        RussianGreyCat russianGreyCat = new RussianGreyCat();
        cat.purr();
//        russianGreyCat.purr();
        russianGreyCat.voice();
        Animal.sayHello();
    }
}

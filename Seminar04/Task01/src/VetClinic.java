import java.util.ArrayList;

/*
 * Задача: Напишите обобщенный класс VetClinic, который представляет собой ветеринарную клинику для различных видов животных. Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов. Продемонстрируйте использование этого класса для работы с пациентами - собаками, кошками и другими животными.*/
public class VetClinic<T> {
    private T client;
    private final ArrayList<T> clients = new ArrayList<>();

//    public VetClinic(T client) {
//        this.client = client;
//    }

    public void add(T client) {
        clients.add(client);
    }

    public T getClient() {
        return client;
    }

    public void setClient(T client) {
        this.client = client;
    }

    void help(T client) {
        if (clients.contains(client)) {
            System.out.printf("Клиент %s принят, вылечен и выписан!\n", client);
        } else {
            System.out.printf("Клиент %s отсутствует!", client);
        }
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "clients=" + clients +
                '}';
    }
}

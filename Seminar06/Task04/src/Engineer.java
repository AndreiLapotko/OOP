/*
* Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен. ISP нарушается, так как интерфейс Worker должен быть разделен на более мелкие интерфейсы, чтобы избежать "жирных" интерфейсов.*/
interface Human {
    void eat();
}

interface Worker {
    void work();
//    void eat();
}

class Engineer implements Worker {
    @Override
    public void work() {

    }
//    public void work() {
// Реализация работы инженера
    }

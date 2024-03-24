/*Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.*/

public class LibraryCard<K, V> {
    protected K number;
    protected V book;
    protected boolean isIssued = false;
    protected String customer;
    public LibraryCard(V book, boolean isIssued) {
//        this.number = number;
        this.book = book;
        this.isIssued = isIssued;
    }

    public K getNumber() {
        return number;
    }
    public void setNumber(K number) {
        this.number = number;
    }

    public V getBook() {
        return book;
    }
    public void setBook(V book) {
        this.book = book;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public String getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        if (!isIssued) {
            return "Карточка " +
                    "номер: " + number +
                    ", " + book;
        } else {
            return "Карточка " +
                    "номер: " + number +
                    ", " + book +
                    ", забрал: " + customer;
        }
    }
}

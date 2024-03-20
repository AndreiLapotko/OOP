
/*
* Adapter (Адаптер):

Задание: Интеграция старой библиотеки с новой системой

Вам нужно разработать адаптер для интеграции старой библиотеки с новой системой.

Создайте интерфейс Document, который определяет методы для открытия и закрытия документа.

Реализуйте класс OldDocument, представляющий старую библиотеку для работы с документами, и имеющий методы openDocument() и closeDocument().

Создайте адаптер DocumentAdapter, который адаптирует класс OldDocument к интерфейсу Document, реализуя методы open() и close().

Напишите клиентский код, который будет использовать адаптер для открытия и закрытия документов в новой системе.*/
public class DocumentAdapter implements Document{
    OldDocument oldDocument;

    public DocumentAdapter(OldDocument oldDocument) {
        this.oldDocument = oldDocument;
    }

    @Override
    public void open() {
        oldDocument.openDocument();
    }

    @Override
    public void close() {
        oldDocument.closeDocument();
    }
}

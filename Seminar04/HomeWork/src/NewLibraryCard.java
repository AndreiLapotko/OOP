public class NewLibraryCard<K, V> extends LibraryCard { //
    public NewLibraryCard(V book, boolean isIssued) {
        super(book, isIssued);
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if (!isIssued) {
            return "Карточка " +
                    "id=" + id +
                    ", номер: " + number +
                    ", " + book;
        } else {
            return "Карточка " +
                    "номер: " + number +
                    ", " + book +
                    ", забрал: " + customer;
        }
    }
}

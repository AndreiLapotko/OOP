public interface VendingMachine {
    void getProduct(String name);
    default void Hello() {
        System.out.println("Hello World!");
    }
}

public class ConsoleProductInfo implements ViewProductInfo{
    @Override
    public void print(String text) {
        String result = String.format("ConsoleProductInfo %s", text);
        System.out.println(result);
    }
}

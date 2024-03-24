public class WinProductInfo implements ViewProductInfo{
    @Override
    public void print(String text) {
        String result = String.format("WinViewDIP %s", text);
        System.out.println(result);
    }
}

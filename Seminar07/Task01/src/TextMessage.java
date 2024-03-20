public class TextMessage implements Message {
    private String message;

    @Override
    public void sendMess() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
import Services.Operations;
import View.App;
import View.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        App app = new App(new View(), new Operations());
        app.run();
    }
}
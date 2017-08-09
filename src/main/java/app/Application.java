package app;

import lombok.Getter;
import lombok.val;

@Getter
public class Application {

    private final String text = "Hello";

    public static void main(String[] args) {
        val app = new Application();
        System.out.println(app.getText());
    }
}

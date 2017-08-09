package app;

import java.io.IOException;

import lombok.val;

public class Application {

    public String greet() {
        return "Hello";
    }

    public static void main(String[] args) throws IOException {
        val app = new Application();
        System.out.println(app.greet());
    }
}

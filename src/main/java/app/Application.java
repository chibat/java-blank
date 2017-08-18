package app;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import lombok.val;

public class Application {

    public String greet() {
        return "Hello";
    }

    public static String getGitRevision() {
        try {
            return ResourceBundle.getBundle("git").getString("git.commit.id");
        } catch (MissingResourceException e) {
            return "";
        }
    }

    public static void main(String[] args) throws IOException {
        val app = new Application();
        System.out.println(app.greet());
        System.out.println("Git revision: " + getGitRevision());
    }
}

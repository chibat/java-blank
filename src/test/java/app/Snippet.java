package app;

import java.util.TreeMap;

import org.junit.Test;

import lombok.val;

public class Snippet {

    /**
     * display system properties
     */
    @Test
    public void displaySystemProperties() {
        val props = System.getProperties();
        new TreeMap<>(props).forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }

    /**
     * display environment values
     */
    @Test
    public void displayEnvironmentValues() {
        new TreeMap<>(System.getenv()).forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}

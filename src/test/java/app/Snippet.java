package app;

import java.util.TreeMap;

import org.junit.Test;

import lombok.val;

public class Snippet {

    /**
     * display system property
     */
    @Test
    public void displaySystemProperties() {
        val props = System.getProperties();
        new TreeMap<>(props).forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}

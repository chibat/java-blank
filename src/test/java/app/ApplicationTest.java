package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lombok.val;

public class ApplicationTest {

    @Test
    public void test() {
        val app = new Application();
        assertEquals("Hello", app.getText());
    }
}

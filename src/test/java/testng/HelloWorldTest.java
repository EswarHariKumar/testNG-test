package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    // Test case 1: Simple Hello World test
    @Test
    public void testHelloWorld() {
        String message = "Hello, World!";
        Assert.assertEquals(message, "Hello, World!");
    }

    // Test case 2: Another basic test
    @Test
    public void testAddition() {
        int sum = 2 + 3;
        Assert.assertEquals(sum, 5);
    }
}

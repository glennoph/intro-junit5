package guru.springframework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void helloWorld() {
        assertEquals(greeting.helloWorld(), "Hello World");
    }

    @Test
    void testHelloWorld() {
        String name = "hey-you";
        assertEquals(greeting.helloWorld(name), "Hello "+name);
    }
}
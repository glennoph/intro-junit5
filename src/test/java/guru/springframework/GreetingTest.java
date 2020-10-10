package guru.springframework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeEach
    void setUp() {
        System.out.println("before test, create greeting");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @Test
    void helloWorld1() {
        assertEquals(greeting.helloWorld(), "Hello World");
    }

    @Test
    void testHelloWorld2() {
        String name = "hey-you";
        assertEquals(greeting.helloWorld(name), "Hello "+name);
    }

    @Test
    void test() {
        System.out.println("test");
    }
}
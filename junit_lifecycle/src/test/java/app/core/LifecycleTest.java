package app.core;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {

    @Test
    void firstTest() {
        System.out.println("first test");
    }

    @Test
    void secondTest() {
        System.out.println("second test");
    }

    @Test
    void thirdTest() {
        System.out.println("third test");
    }

}

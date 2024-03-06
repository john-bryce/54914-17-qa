package app.core;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {

    @BeforeAll
    static void start() {
        System.out.println("Before All");
    }

    @AfterAll
    static void close() {
        System.out.println("After All");
    }

    @BeforeEach
    void intro() {
        System.out.println("------> starting a test");
    }

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("first test");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("second test");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("third test");
    }
}

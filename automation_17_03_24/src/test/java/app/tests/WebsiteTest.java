package app.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTest {
    private static String protocol = "file:///";
    private static String baseUrl = System.getProperty("user.dir") + "/src/main/resources/web/";
    private static WebDriver driver = new ChromeDriver(); // open the browser

    @BeforeAll
    static void init() {
        driver.get(protocol + baseUrl + "index.html"); // navigate to index.html (home page)
        driver.manage().window().maximize();
    }

    @AfterAll
    static void destroy() {
        driver.quit(); // close the browser
    }

    @Test
    void numberOfImagesTest() {
        int expected = 3;
        int actual = driver.findElements(By.tagName("img")).size(); // 3
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showHideImagesTest() {
        // get DOM elements
        WebElement checkbox = driver.findElement(By.id("ch-show")); // get the checkbox element
        WebElement imagesDiv = driver.findElement(By.id("div-images")); // get the images div

        sleep();
        checkbox.click(); // show images - style is now: ''

        // test that images are displayed
        String expected = "";
        String actual = imagesDiv.getDomAttribute("style");
        Assertions.assertEquals(expected, actual);

        sleep();
        checkbox.click(); // hide images - style is: 'display: none;'
        // test that the images are hidden
        expected = "display: none;";
        actual = imagesDiv.getDomAttribute("style");
        Assertions.assertEquals(expected, actual);
        sleep();
    }

    private static void sleep() {
        sleep(1000);
    }

    private static void sleep(long timeMills) {
        try {
            Thread.sleep(timeMills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

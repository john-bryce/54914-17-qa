package a;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WebsiteTest {
    static WebDriver driver;

    @Order(1)
    @Test
    void homePageTest() throws InterruptedException {
        //open the home page
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/web/index.html");
        // check the title of this page:
        Assertions.assertEquals("Home", driver.getTitle());
        // check the text of h1 element:
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Home Page", h1.getText());
        Thread.sleep(2000);
    }

    @Order(2)
    @Test
    void nextPageTest() throws InterruptedException {
        WebElement linkElement = driver.findElement(By.linkText("go to next page"));
        linkElement.click();
        // check the title of the next page:
        Assertions.assertEquals("next page", driver.getTitle());
        Thread.sleep(2000);
    }

    @Order(3)
    @Test
    void inputTest() throws InterruptedException {
        // first name input
        WebElement inputFirstName = driver.findElement(By.id("first-name"));
        inputFirstName.sendKeys("Eldar");
        Thread.sleep(2000);

        // last name input
        WebElement inputLastName = driver.findElement(By.id("last-name"));
        inputLastName.sendKeys("Bakshi");
        Thread.sleep(2000);

        // submit
        WebElement submitElement = driver.findElement(By.id("send"));
        submitElement.click();
        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        Assertions.assertEquals("Home", driver.getTitle());
    }

    @BeforeAll
    static void setBeforeClass() {
        driver = new ChromeDriver(); // open the browser
        driver.manage().window().maximize(); // full screen
    }

    @AfterAll
    static void setAfterClass() {
        driver.quit();
    }

}

package a;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    static WebDriver driver;

    @BeforeAll
    static void setBeforeClass(){
        driver = new ChromeDriver(); // open the browser
        driver.manage().window().maximize(); // full screen
    }
    @AfterAll
    static void setAfterClass(){
        driver.quit();
    }

    @Test
    void homePageTest(){
        //open the home page
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/web/index.html");
        // check the title of this page:
        Assertions.assertEquals("Home", driver.getTitle());
    }


}

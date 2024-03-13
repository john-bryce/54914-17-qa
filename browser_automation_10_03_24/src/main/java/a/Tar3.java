package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Tar3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // working with http protocol we need to define the url:
        // driver.get("http://127.0.0.1:5500/file3.html");

        // working with file protocol, we need to define the file path:
        String protocol = "file:///";
        String userDir = System.getProperty("user.dir"); // obtain the current working directory
        String relativeFIlePath = "/src/main/resources/web/file3.html";
        System.out.println(protocol + userDir + relativeFIlePath);
        driver.get(protocol + userDir + relativeFIlePath);

        List<WebElement> aElements = driver.findElements(By.tagName("a"));

        // get the links as objects
        WebElement link1 = aElements.get(0);
        WebElement link2 = aElements.get(1);
        //
        System.out.println("number of links is: " + aElements.size());
        System.out.println("text of link 1: " + link1.getText());
        System.out.println("text of link 2: " + link2.getText());

        driver.quit();
    }
}

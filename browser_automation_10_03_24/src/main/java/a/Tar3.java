package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tar3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/file3.html");
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

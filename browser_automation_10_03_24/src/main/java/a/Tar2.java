package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tar2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:5500/file2.html");

        // 1. get the page title
        String title = driver.getTitle();

        // 2. get the page main heading text
        WebElement e = driver.findElement(By.tagName("h1"));
        String headingText = e.getText();

        // 3. get the text in the second paragraph - we have to get all p elements in the DOM
        List<WebElement> list = driver.findElements(By.tagName("p"));
        WebElement p2 = list.get(1);
        String p2Text = p2.getText();

        driver.quit();

        // print the results:
        System.out.println("page title: " + title);
        System.out.println("page heading: " + headingText);
        System.out.println("page second paragraph: " + p2Text);
    }
}

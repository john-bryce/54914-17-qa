package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("running browser automation");
        WebDriver driver = new ChromeDriver(); // open browser
        //Thread.sleep(3000);
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.get("https://www.google.com"); // navigate to url
        //Thread.sleep(3000);
        driver.get("http://127.0.0.1:5500/index.html"); // navigate to another url
        //Thread.sleep(3000);

        // get the page title:
        String title = driver.getTitle();
        System.out.println("page title is: " + title);

        // get the h1 element in the page:
        WebElement element = driver.findElement(By.tagName("h1"));
        String text = element.getText();
        System.out.println("the heading text is: " + text);

        driver.quit(); // close browser
    }
}

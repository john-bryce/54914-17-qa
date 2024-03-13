package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        // WebDriver driver = new ChromeDriver();

        // working with http protocol we need to define url:
        String httpProtocol = "http://";
        String ip = "127.0.0.1"; // ip address of our computer - local host
        String port = ":5500"; // live server port
        String resource = "/file3.html";
        // driver.get(httpProtocol + ip + port + resource);

        // working with file protocol, we need to define the file path
        String fileProtocol = "file:///";
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);


        Thread.sleep(5000);
        // driver.quit();

    }
}

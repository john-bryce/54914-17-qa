package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();

        // working with http protocol we need to define url:
        String httpProtocol = "http://";
        String ip = "127.0.0.1"; // ip address of our computer - local host
        String port = ":5500"; // live server port
        String resource = "/file3.html";
        // driver.get(httpProtocol + ip + port + resource);

        // working with file protocol, we need to define the file path
        // file:///C:/programming/qa_54914_17_jerusalem/workspace/selenium_13_03_24/src/main/resources/web/file3.html
        String fileProtocol = "file:///";
        String userDir = System.getProperty("user.dir");
        String relativePath = "/src/main/resources/web/file3.html";
        System.out.println(fileProtocol + userDir + relativePath);
        driver.get(fileProtocol + userDir + relativePath);


        Thread.sleep(5000);
         driver.quit();

    }
}

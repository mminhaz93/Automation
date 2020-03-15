package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Iframe {
    public static void main(String[] args) {
        String baseURL = "https://www.guru99.com/handling-iframes-selenium.html";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        int index = 0;
        // Get list of frames
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        for (WebElement iframe : iframes) {
            // Print id property of each webelement
            //index++ increases index by 1 start from 0
            System.out.println((index++) + " : " + iframe.getAttribute("id"));
        }

        driver.quit();
    }
}

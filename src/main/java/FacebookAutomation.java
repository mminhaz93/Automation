import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FacebookAutomation {
    public WebDriver driver ;
    private static final Logger logger = LogManager.getLogger(FacebookAutomation.class);

    @BeforeClass
    public void initialSetup(){
        driver = new ChromeDriver();
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {


        driver.get("http://www.facebook.com");
        logger.trace("Browser launched");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement search_button = driver.findElement(By.name("q"));

//        search_button.sendKeys("Selenium");

        // Not needed but forcing the browser to wait for 4 seconds
        Thread.sleep(4000);

        // Check if title is Facebook
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals("Facebook")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

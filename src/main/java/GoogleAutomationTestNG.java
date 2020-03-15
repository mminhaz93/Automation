import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GoogleAutomationTestNG {
    public WebDriver driver ;

    /* Syntax of testNG
     @annotation
     method(){ }
    */

    @BeforeClass // Annotation
    public void initialSetup(){
        //System.setProperty("webdriver.chrome.driver","FILE_PATH\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement search_button = driver.findElement(By.name("q"));
        search_button.sendKeys("Selenium");
        // Not needed but forcing the browser to wait for 4 seconds
        Thread.sleep(4000);

        // Check if title is Google
        String actualTitle = driver.getTitle();

//        if (actualTitle.contentEquals("Google")) {
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }

        //Validation test - without this, your tests aren't completed
        Assert.assertTrue(actualTitle.contains("Google")); // this line replaces the commented lines above ( if/else lines)
    }


    @Test
    public void verifyFBHomepageTitle() throws InterruptedException {
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement search_button = driver.findElement(By.name("q"));

//        search_button.sendKeys("Selenium");

        // Not needed but forcing the browser to wait for 4 seconds
        Thread.sleep(4000);

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains("Facdsfsdfebook"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
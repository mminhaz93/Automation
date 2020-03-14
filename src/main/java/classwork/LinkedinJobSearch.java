package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LinkedinJobSearch {
    public WebDriver driver ;

    @BeforeClass
    public void initialSetup(){
        //System.setProperty("webdriver.chrome.driver","FILE_PATH\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize window
        driver.manage().deleteAllCookies();
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {

        driver.get("https://www.linkedin.com/");
        Thread.sleep(2000);

//        WebDriverWait wait=new WebDriverWait(driver, 20);

//        WebElement searchPlaceHolder = driver.findElement(By.name("search__placeholder--search"));
//        if (searchPlaceHolder.isEnabled()) {
//            searchPlaceHolder.click();
//        }

//        WebElement guru99seleniumlink;
//        guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "search__placeholder--search")));
//        WebElement searchPlaceHolder = driver.findElement(By.name("search__placeholder--search"));
//        searchPlaceHolder.click();

        WebElement searchTextBox = driver.findElement(By.xpath("//input[@name='keywords']"));
        searchTextBox.clear();
        searchTextBox.sendKeys("Selenium");
        Thread.sleep(2000);

        WebElement locationTextBox = driver.findElement(By.xpath("//input[@name='location']"));
        searchTextBox.sendKeys("New York");

        // Not needed but forcing the browser to wait for 4 seconds
        Thread.sleep(4000);

        // Check if title is Google
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals("Google")) {
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
package HomeWork.Musaib.HW0328_MoMovies.test;

import HomeWork.Musaib.HW0328_MoMovies.pages.MoMoviesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class MoMoviesHomePageTest {
    WebDriver driver;

    MoMoviesPage page;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://momovies.netlify.com/movies");
    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * <p>
     * Verify login page title as guru99 bank
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */

    @Test(priority = 0)
    public void verifyHomePageTitle() throws InterruptedException {
        page = new MoMoviesPage(driver);

        page.searchMovie("Safe");
        page.clickDropdown();


        String expectedTitle = "MoMovies: Movies | Movie Trailer | Movie Details";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 1)
    public void contractUSClick () {
        page = new MoMoviesPage(driver);

        page.contactUs();
        page.enterName("Musaib Ahmed");
        page.enterEmail("musaib1124@gmail.com");
        page.enterMessage("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. ");
        page.submitFrom();
    }

    @Test
    public void verifySuccesMessage() throws InterruptedException{
        page = new MoMoviesPage(driver);
        String actualTitle = page.succesMessage();
        if (actualTitle.contentEquals("The form was submitted successfully.")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
   }



//    @AfterTest
//    public void afterClass() {
//        driver.quit();
//    }
}

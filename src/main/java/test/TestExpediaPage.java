package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ExpediaPage;

public class TestExpediaPage {
    WebDriver driver;

    ExpediaPage page;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.expedia.com/");
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        page = new ExpediaPage(driver);

        page.clickFlightButton();
        page.enterFlyingFrom("dhaka,bangladesh");
        page.enterFlyingTo( "Orlando,florida");
        page.enterDepartingDate("03/09/2020");
        page.enterReturningDate( "04/10/2020");
    }



    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}



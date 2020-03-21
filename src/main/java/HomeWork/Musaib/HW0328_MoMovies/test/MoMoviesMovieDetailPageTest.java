package HomeWork.Musaib.HW0328_MoMovies.test;

import HomeWork.Musaib.HW0328_MoMovies.pages.MoMoviesDetails;
import HomeWork.Musaib.HW0328_MoMovies.pages.MoMoviesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoMoviesMovieDetailPageTest {
    WebDriver driver;

    MoMoviesDetails page;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://momovies.netlify.com/movies/72387");
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        page = new MoMoviesDetails(driver);

        page.backToMoviesPage();
        String expectedTitle = "MoMovies: Movies | Movie Trailer | Movie Details";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

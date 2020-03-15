import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;

        //System.setProperty("webdriver.chrome.driver","FILE_PATH\chromedriver.exe");

//		driver = new FirefoxDriver();

        WebDriver driver = new ChromeDriver();

        String baseURL = "http://www.facebook.com";
        String expectedTitle = "Facebook";

        // Navigate to google
        driver.get(baseURL); // will navigate and wait till the entire page is loaded
        //driver.navigate().to("http://www.google.com"); // Take you to the page and not wait

//		WebElement search_button = driver.findElement(By.name("q"));

//		search_button.sendKeys("Selenium");

//		// Not needed but forcing the browser to wait for 4 seconds
//		Thread.sleep(4000);

        // Check if title is Google
        String actualTitle = driver.getTitle();

//		System.out.println("Page title: " + actualTitle);

//		Boolean result = actualTitle.equals("Google");
//		System.out.println("Page title is Google ?  " + result);

        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // close browser
        driver.close();
    }

}
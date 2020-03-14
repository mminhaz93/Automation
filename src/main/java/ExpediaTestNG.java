import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ExpediaTestNG {
    public WebDriver driver ;

    @BeforeClass
    public void initialSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        driver.get("https://www.expedia.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*
   public class MyClass {
  public static void main(String[] args) {
    printName("Minhaz");
    enterFlyingFrom("NYC");
  }

   static void enterFlyingFrom(String location) {
    System.out.println("I am flying from " + location);
}
    static void printName(String name) {
    System.out.println("My name is " + name);
  }
}
         */


        //Get all elements
        By flightButtonElm = By.id("tab-flight-tab-hp");
        By flyingFromElm = By.id("flight-origin-hp-flight");
        By flyingToElm = By.id("flight-destination-hp-flight");
        By departingDateElm = By.id("flight-departing-hp-flight");
        By returningDateElm = By.id("flight-returning-hp-flight");

//        String name = "Minhaz";
//        System.out.println("My name is " + name);


        clickFlightButton(flightButtonElm);
        enterFlyingFrom(flyingFromElm, "dhaka,bangladesh");
        enterFlyingTo(flyingToElm, "Orlando,florida");
        enterDepartingDate(departingDateElm, "03/09/2020");

        enterReturningDate(returningDateElm, "04/10/2020");
    }

    public void enterDepartingDate(By departingDateElm, String date) {
        WebElement departingDate = driver.findElement(departingDateElm);
        departingDate.sendKeys(date);
    }

    public void enterFlyingFrom(By flyingFromElm, String location) {
        WebElement flyingFrom = driver.findElement(flyingFromElm);
        flyingFrom.sendKeys(location);
    }

    public void enterFlyingTo(By flyingToElm, String location) {
        WebElement flyingTo = driver.findElement(flyingToElm);
        flyingTo.sendKeys(location);
    }


    public void enterReturningDate(By returningDateElm, String date) throws InterruptedException {
        WebElement returningDate = driver.findElement(returningDateElm);
        returningDate.sendKeys("");
        returningDate.click();
        Thread.sleep(2000);
        returningDate.sendKeys("");
        returningDate.sendKeys(date);
    }


    public void clickFlightButton(By flightButtonElm) {
        WebElement flightButton = driver.findElement(flightButtonElm);
        flightButton.click();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

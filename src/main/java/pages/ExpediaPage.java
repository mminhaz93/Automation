package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpediaPage {

    //Constructor and get the driver from Test Page
    public ExpediaPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;

    //All locators
    //Get all elements
    By flightButtonElm = By.id("tab-flight-tab-hp"); // Page-factory becomes - @FindBy(name="tab-flight-tab-hp") WebElement flightButtonElm;
    By flyingFromElm = By.id("flight-origin-hp-flight");
    By flyingToElm = By.id("flight-destination-hp-flight");
    By departingDateElm = By.id("flight-departing-hp-flight");
    By returningDateElm = By.id("flight-returning-hp-flight");


    //All methods you can perform
    public void clickFlightButton() {
        WebElement flightButton = driver.findElement(flightButtonElm);
        flightButton.click();
    }

    public void enterFlyingFrom(String location) {
        WebElement flyingFrom = driver.findElement(flyingFromElm);
        flyingFrom.sendKeys(location);
    }

    public void enterFlyingTo(String location) {
        WebElement flyingTo = driver.findElement(flyingToElm);
        flyingTo.sendKeys(location);
    }

    public void enterDepartingDate(String date) {
        WebElement departingDate = driver.findElement(departingDateElm);
        departingDate.sendKeys(date);
    }

    public void enterReturningDate(String date) throws InterruptedException {
        WebElement returningDate = driver.findElement(returningDateElm);
        returningDate.sendKeys("");
        returningDate.click();
        Thread.sleep(2000);
        returningDate.sendKeys("");
        returningDate.sendKeys(date);
    }
}
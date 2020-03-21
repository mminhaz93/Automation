package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperFunctions {

    public HelperFunctions(WebDriver driver) {
        this.driver =  driver;
    }

    WebDriver driver;

    //Helper functions
    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void clickElementByIndex(By locator, int index) throws InterruptedException {
        List<WebElement> listOfCast = driver.findElements(locator);
        listOfCast.get(index).click();
//        castOnClick.click();
        Thread.sleep(5000);
    }
}

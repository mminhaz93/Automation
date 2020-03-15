import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsFunctions {

    public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;

//        System.setProperties("driver.chrome.driver", "path");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://the-internet.herokuapp.com/drag_and_drop";

        /*
        // Go to guru99 page
        driver.get(baseUrl);

        //import action class
        Actions action = new Actions(driver);

        //Elements
        //BoxA
        WebElement boxA = driver.findElement(By.id("column-a"));

        //BoxB
        WebElement boxB = driver.findElement(By.id("column-b"));

        action.dragAndDrop(boxA,boxB).build().perform();
//        action.dragAndDropBy(boxA,368, 88).build().perform();

        */

        driver.get("https://demoqa.com/droppable/");

        //BoxA
        WebElement boxA = driver.findElement(By.id("draggable"));

        //BoxB
        WebElement boxB = driver.findElement(By.id("droppable"));

        Thread.sleep(3000);
        Actions action = new Actions(driver);
//        action.dragAndDrop(boxA,boxB).build().perform();

        action.moveToElement(boxA);

        Thread.sleep(3000);
        // close browser
        driver.close();


    }

}



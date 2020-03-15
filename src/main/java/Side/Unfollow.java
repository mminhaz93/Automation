package Side;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Unfollow {
    public static void main(String[] args) throws InterruptedException {
        //Create a map to store  preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

//Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

// set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        String baseURL = "https://www.facebook.com/friends/requests/?fcref=ft&outgoing=1";
//        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        driver.findElement(By.id("email")).sendKeys("minhaz93");
        driver.findElement(By.id("pass")).sendKeys("pass");
        driver.findElement(By.id("loginbutton")).click();



       List<WebElement> pops = driver.findElements(By.cssSelector(".outgoingButton"));
        System.out.println("left" +  pops.size());


       Actions actions = new Actions(driver);


        int index = 0;
           for (WebElement pop : pops) {
               if(index != 9) {
                   actions.moveToElement(pop);
                   actions.click().build().perform();
                   driver.findElement(By.xpath("//*[@class=\"uiMenu FriendListActionMenu\"]/ul/li[3]/a")).click();
                   Thread.sleep(2000);
                   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pop);
                   System.out.println((index++));
               }
               else{
                   driver.quit();
               }
           }


    }
}

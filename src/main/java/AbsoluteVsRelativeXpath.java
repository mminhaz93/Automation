import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbsoluteVsRelativeXpath {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperties("driver.chrome.driver", "path");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/simple_context_menu.html";

        // Go to guru99 page
        driver.get(baseUrl);

        //Rightbuttond
//        WebElement rightClickButton = driver.findElement(By.className("context-menu-one btn btn-neutral"));

        WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one.btn"));

        // can use Xpath as well - //span[@class="context-menu-one btn btn-neutral"]

        //import action class
        Actions action = new Actions(driver);

        //Right click an element
//        action.contextClick(rightClickButton).perform();

        //double click
        WebElement doubleClickButton = driver.findElement(By.xpath("//body[@id='authentication']//button"));
        action.doubleClick(doubleClickButton).perform();

        Thread.sleep(1000);

        //Handle alert
        //Accepting Javascript alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //dismissing JavaScript alert
//        Alert alt=driver.switchTo().alert();
//        alt.dismiss();


        Thread.sleep(3000);
        // close browser
        driver.close();
    }

}


//        https://www.jcpenney.com/?cm_mmc=admarketplace%20brand&-_-Brand-_-Brand-Phrase-_-jc+penney&utm_source=admarketplace&utm_medium=cpc&utm_campaign=paid%20search&cid=paid%20search%7cadmarketplace%7cBrand%7cBrand-Phrase&gclid=CIflpLSas-cCFTUEiAkdTXkF0g&gclsrc=ds
//        Absolute Xpath -
//        html/body/div/main/header/div[3]/div/div/div/div[2]/div/div/ul/li[2]/div/a

        /*
       Relative XPATH
        <ul
        id
        class="_3H32C _1lBya"
        data-automation-id="at-error-helpfullinks-renderer"
        >


        ul - unordered list (input)
         attributes or properties of ul input/tag -
             class="_3H32C _1lBya"
             data-automation-id="at-error-helpfullinks-renderer"


        example:
        //ul[@class="_3H32C _1lBya"]
        //ul[@data-automation-id="at-error-helpfullinks-renderer"]
        //ul[@class="_3H32C _1lBya"][@data-automation-id="at-error-helpfullinks-renderer"]
        //ul[@class="_3H32C _1lBya" and @data-automation-id="at-error-helpfullinks-renderer"]


        Staples example
        <div id="category-membership" class="bottom-bar-menu__category-dropdownLast">
            <a data-analyticstype="HEADER" tabindex="0" href="/gms/enroll" rel="nofollow" title="MEMBERSHIP">MEMBERSHIP</a>
        </div>

        Xpath - //div[@id="category-membership"]//a[@data-analyticstype="HEADER"]


        <div class="carousel__heading">
            <div class="carousel__title" title="Popular categories">Popular categories</div>
        </div>

        //div[@class="carousel__heading"]//div[@class="carousel__title"]
        */
package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedInClass {
    public static void main(String[] args) throws InterruptedException {

        //WebDriver driver  = new FirefoxDriver();
        WebDriver driver  = new ChromeDriver();
        //WebDriver driver1  = new SafariDriver();
        driver.get("https://www.linkedin.com/");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Popup
        try{
            WebElement ee = driver.findElement(By.xpath("//button//li-icon[@class='sign-in-card__dismiss-icon onload lazy-loaded']"));
            ee.click();
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            String title = driver.getTitle();
            boolean b = title.contains("LinkedIn: Log In or Sign Up");
            System.out.println(b);
            Thread.sleep(2000);
            //enter jobtitle/position
            try {
                //button[@class='search__placeholder--search search-input'
                WebElement a = driver.findElement(By.xpath("//button[@class='search__placeholder--search search-input']"));
                a.click();
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                Thread.sleep(2000);
                WebElement e1 = driver.findElement(By.xpath("//*[@id='JOBS']/section[1]/input"));//button[@class='search__placeholder--search search-input']
                e1.click();
                //e1.clear();
                e1.sendKeys("Engineer");
                WebElement e2 = driver.findElement(By.cssSelector(".typeahead-input__dropdown-list li"));
                e2.click();
                Thread.sleep(4000);
//                Thread.sleep(2000);
//                //enter location
//                WebElement e2 = driver.findElement(By.xpath("//*[@id='JOBS']/section[2]/input"));
//                e2.clear();
//                e2.sendKeys("Bangladesh");
//                Thread.sleep(2000);
//                WebElement e4 = driver.findElement(By.xpath("/html/body/main/section[1]/div/h1"));
//                e4.click();
//                Thread.sleep(2000);
//                //click on search button
//                WebElement e3 = driver.findElement(By.xpath("//button[@form='JOBS']"));
//                e3.click();
//                Thread.sleep(2000);
//                driver.quit();
            }
        }
    }
}
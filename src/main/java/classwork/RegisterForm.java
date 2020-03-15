package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
    public static void main(String[] args) {

        String baseURL = "http://demo.guru99.com/test/newtours/register.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByIndex(1);

        String selectedValue = drpCountry.getFirstSelectedOption().getText();
        System.out.println(selectedValue);
        driver.quit();
    }
}

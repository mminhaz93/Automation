package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseURL = "http://demo.guru99.com/test/radio.html";
        driver.get(baseURL);

        // Click all radio buttons
        for(int i = 1; i <= 3; i++){
            WebElement radioButton = driver.findElement(By.id("vfb-7-"+ i));
            radioButton.click();
        }

        //Click all checkbox
        for(int i = 0; i <= 2; i++){
            WebElement checkBox = driver.findElement(By.id("vfb-6-"+ i));
            checkBox.click();
        }

        driver.quit();
    }
}

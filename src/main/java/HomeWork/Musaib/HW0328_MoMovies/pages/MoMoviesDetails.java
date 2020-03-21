package HomeWork.Musaib.HW0328_MoMovies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoMoviesDetails {
    public MoMoviesDetails(WebDriver driver) {
        this.driver =  driver;
    }

    WebDriver driver;

    By backToMoviesElm = By.xpath("//a[@href=\"/movies\"]");

    public void backToMoviesPage (){
        WebElement backToMovies = driver.findElement(backToMoviesElm);
        backToMovies.click();
    }


}

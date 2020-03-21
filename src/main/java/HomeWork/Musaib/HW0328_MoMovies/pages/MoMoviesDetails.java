package HomeWork.Musaib.HW0328_MoMovies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.HelperFunctions;

import java.util.List;

public class MoMoviesDetails {
    public MoMoviesDetails(WebDriver driver) {
        this.driver =  driver;
    }

    WebDriver driver;

    HelperFunctions helper = new HelperFunctions(driver);

    By backToMoviesElm = By.xpath("//a[@href=\"/movies\"]");
    By castClickElm = By.xpath("//div[@class='card text-center cast-card__container']//button[@class='ButtonLink open-model-link']");

    public void backToMoviesPage (){
        helper.clickElement(backToMoviesElm);
    }


    public void castClick () throws InterruptedException {
        helper.clickElementByIndex(castClickElm, 1);
    }





}

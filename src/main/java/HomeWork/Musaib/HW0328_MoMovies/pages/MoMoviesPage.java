package HomeWork.Musaib.HW0328_MoMovies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoMoviesPage {



    public MoMoviesPage(WebDriver driver) {
        this.driver =  driver;
    }

    WebDriver driver;

    By searchFieldElm = By.id("search-input");
    By dropDownElm = By.xpath("//*[@id=\"basic-navbar-nav\"]/form/span/div/ul/li[1]/div/div/a/p");
    By contactUsElm = By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a");
    By enterNameElm = By.id("validationCustom01");
    By enterEmailElm = By.id("validationCustom02");
    By enterMessageElm = By.id("validationCustom03");
    By submitElm = By.xpath("//*[@id=\"root\"]/main/div/form/div[4]/button");
    By succesMessageElm = By.xpath("//*[@id=\"site-frame\"]/div[1]/div/div/div/p");
//    @FindBy(id = "search-input") WebElement searchField;
//    @FindBy(className = "search-input") WebElement contractUs;

    public void searchMovie(String movieName){
        WebElement searchMovieText = driver.findElement(searchFieldElm);
        searchMovieText.sendKeys(movieName);

//        driver.findElement(By.id("search-input")).sendKeys("F9");
//        searchField.sendKeys(name);
//        driver.findElement(By.className("nav-link")).click();
       }

       public void clickDropdown (){
        WebElement clickMovieText = driver.findElement(dropDownElm);
        clickMovieText.click();
       }

       public void contactUs (){
        WebElement clickContactUs = driver.findElement(contactUsElm);
        clickContactUs.click();
       }

       public void enterName (String name){
        WebElement enterNameText = driver.findElement(enterNameElm);
        enterNameText.sendKeys(name);
       }

    public void enterEmail (String email){
        WebElement enterEmailText = driver.findElement(enterEmailElm);
        enterEmailText.sendKeys(email);
    }

    public void enterMessage (String message){
        WebElement enterMessageText = driver.findElement(enterMessageElm);
        enterMessageText.sendKeys(message);
    }

    public void submitFrom(){
        WebElement submitClick = driver.findElement(submitElm);
        submitClick.click();
    }

    public String succesMessage(){
       WebElement succesMessageText  = driver.findElement(succesMessageElm);
       String Message = succesMessageText.getText();
        return Message;
    }
//    public void clickFlightButton() {
//        WebElement flightButton = driver.findElement(flightButtonElm);
//        flightButton.click();
//    }
}

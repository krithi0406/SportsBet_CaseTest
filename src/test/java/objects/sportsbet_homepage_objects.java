package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sportsbet_homepage_objects {
    WebDriver driver;
    @FindBy(xpath= "(//div[@data-automation-id=\"carousel-1-cell-1-event-label\"])[1]") public static WebElement first_RaceCard_Timer;
    @FindBy(xpath = "//input[@id='gh-ac']") public WebElement SearchBox;
    @FindBy(xpath = "//input[@id='gh-btn']") public WebElement SearchButton;

    public sportsbet_homepage_objects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }



}



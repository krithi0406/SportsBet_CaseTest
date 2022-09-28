package actions;

import org.openqa.selenium.*;
import org.testng.Assert;

import static actions.common_actions.Pather.xPath;
import static actions.common_actions.*;


public class sportsbet_homePage_actions extends common_actions {

    public static WebElement raceTimerFirstVisible;
    public static WebElement firstBetableRace;
    public static WebElement raceTitle_BettingScreen;
    public static WebElement select_Favorite;
    public static WebElement select_AnyOther;
    public  static WebElement hide_BetSlipIcon;

    public static WebElement fav_RunnerName;
public static WebElement other_RunnerName;
public static WebElement btn_Betslip;
public static WebElement betSlip_Content;


    public static void open_Website(String url, int width) {
        navigateToUrl(url);
        changeScreenDimension(width);
        Assert.assertEquals(driver.getTitle(), "Best Online Horse Racing and Sports Betting | Sportsbet");
    }

    public static void race_Selector() throws InterruptedException {

        raceTimerFirstVisible = findElement("(//div[@data-automation-id=\"carousel-1-cell-1-event-label\"])[1]//span", xPath, TimeOut.LOW);
        if (raceTimerFirstVisible.getText().contains("m") && !raceTimerFirstVisible.getText().contains("-")) {
            System.out.println("The Next First Race has more than a Minute to bet. Good to Proceed ");
            firstBetableRace = findElement("(//div[@data-automation-id=\"carousel-1-cell-1-event-label\"]//span//parent::div//parent::div//parent::div//parent::div//span)[1]",xPath,TimeOut.LOW);
        } else if (raceTimerFirstVisible.getText().contains("Live") || raceTimerFirstVisible.getText().contains("-") || !raceTimerFirstVisible.getText().contains("m")) {
            System.out.println("The  First Race is either LIVE or does not have more than a Minute to start bet. Hence will wait for the next available race");
            firstBetableRace = findElement("(//div[@data-automation-id=\"scrollable-container-group-1-carousel-1-body-container\"]//div//span[contains(text(),'Race')]//following::span[not(contains(text(),'Live')) and not (contains(text(),'-')) and (contains(text(),'m'))]//parent::div//parent::div//parent::div//parent::div//span)[1]", xPath, TimeOut.LOW);

        }
        System.out.println("Race Title is : "+firstBetableRace.getText());
    }

    public static void start_Bet() throws InterruptedException {


        firstBetableRace.click();
        raceTitle_BettingScreen = findElement("//div[@data-automation-id=\"contextual-nav-title\"]//h1", xPath, TimeOut.HIGH);
        try {
            Assert.assertEquals(firstBetableRace.getText(), raceTitle_BettingScreen.getText());
        } catch (Exception ex){}
        select_Favorite = findElement("//div[contains(@class,'priceContainerWithFavouriteFlag')]//span[contains(@class,'favouriteFlag')]//parent::div",xPath,TimeOut.LOW);
        fav_RunnerName = findElement("//div[contains(@class,'priceContainerWithFavouriteFlag')]//span[contains(@class,'favouriteFlag')]//preceding::div[@data-automation-id=\"racecard-outcome-name\"][1]",xPath,TimeOut.LOW);
        System.out.println("Favorite Runner :" +fav_RunnerName.getText());
        select_Favorite.click();
        hide_BetSlipIcon= findElement("//i[@data-automation-id=\"betslip-header-hide\"]",xPath,TimeOut.LOW);
        hide_BetSlipIcon.click();
        select_AnyOther = findElement("(//div[contains(@class,'priceContainerWithFavouriteFlag')]//span[not(contains(@class,'favouriteFlag'))]//following::div[contains(@class,'outcomeDetails')] | //preceding::div[contains(@class,'outcomeDetails')][1]//div[contains(@class,'priceContainer')]//div)[1]",xPath,TimeOut.LOW);
        other_RunnerName=findElement("(//div[contains(@class,'priceContainerWithFavouriteFlag')]//span[not(contains(@class,'favouriteFlag'))]//following::div[contains(@class,'outcomeDetails')] | //preceding::div[contains(@class,'outcomeDetails')][1]//div[contains(@class,'priceContainer')]//div)[1]//preceding::div[@data-automation-id=\"racecard-outcome-name\"][1]",xPath,TimeOut.LOW);
        System.out.println("Other Runner :" +other_RunnerName.getText());
        select_AnyOther.click();
        btn_Betslip = findElement("//button[@data-automation-id=\"header-betslip-touchable\"]",xPath,TimeOut.LOW);
        btn_Betslip.click();
        betSlip_Content = findElement("//div[contains(@class,'betslipContent')]",xPath,TimeOut.LOW);
        if(betSlip_Content.isDisplayed())
try
        {

            Assert.assertEquals(findElement("//span[@data-automation-id=\"betslip-bet-title\"][1]",xPath,TimeOut.LOW).getText(),fav_RunnerName.getText());
            Assert.assertEquals(findElement("//span[@data-automation-id=\"betslip-bet-title\"][2]",xPath,TimeOut.LOW).getText(),other_RunnerName.getText());
        }catch (Exception e)
{

}


    }
}
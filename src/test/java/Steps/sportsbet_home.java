package Steps;

import actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class sportsbet_home extends common_actions {


    @Given("^User opens the \"([^\"]*)\" website in \"([^\"]*)\" px width$")
    public void userOpensTheWebsiteIn(String url, int width) {
        navigateToUrl("https://sportsbet.com.au");
        changeScreenDimension(420);
        Assert.assertEquals(driver.getTitle(),"Best Online Horse Racing and Sports Betting | Sportsbet");
    }

    @And("^User checks the next race time remaining to bet$")
    public void userChecksTheNextRaceTimeRemianingToBet() throws InterruptedException {
        sportsbet_homePage_actions.race_Selector();

   }

    @When("^User starts to bet on the next race$")
    public void userStartsToBetOnTheNextRace() throws InterruptedException {
        sportsbet_homePage_actions.start_Bet();
    }
}
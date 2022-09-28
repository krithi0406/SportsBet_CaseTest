package Steps;

import actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static actions.sportsbet_homePage_actions.*;

public class sportsbet_home extends common_actions {


    @Given("^User opens the \"([^\"]*)\" website in \"([^\"]*)\" px width$")
    public void userOpTheWebsiteIn(String website, int width) {
        if (website.contentEquals("Sportsbet"))
        {
            website="https://sportsbet.com.au";
        }
        open_Website(website,width);
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
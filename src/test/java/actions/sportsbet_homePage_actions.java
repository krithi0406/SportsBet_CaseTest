package actions;

import org.openqa.selenium.*;

import static actions.common_actions.Pather.xPath;


public class sportsbet_homePage_actions extends common_actions{

    static WebElement raceTimerFirstVisible;
    static WebElement firstBetableRace;



    public static void race_Selector() throws InterruptedException {

        raceTimerFirstVisible = findElement("(//div[@data-automation-id=\"carousel-1-cell-1-event-label\"])[1]//span", xPath, TimeOut.LOW);
        if (raceTimerFirstVisible.getText().contains("m") && !raceTimerFirstVisible.getText().contains("-")) {
            System.out.println("The Next First Race has more than a Minute to bet. Good to Proceed ");
           firstBetableRace =  raceTimerFirstVisible ;
        } else if (raceTimerFirstVisible.getText().contains("Live") || raceTimerFirstVisible.getText().contains("-") ||!raceTimerFirstVisible.getText().contains("m")) {
            System.out.println("The  First Race is either LIVE or does not have more than a Minute to start bet. Hence will wait for the next available race");
            firstBetableRace = findElement("(//div[@data-automation-id=\"scrollable-container-group-1-carousel-1-body-container\"]\n" +
                    "                   // div//span[contains(text(),'Race')]//following::span[not(contains(text(),'Live')) and not (contains(text(),'-')) and (contains(text(),'m'))])[1]", xPath, TimeOut.LOW);
        }
    }

    public static void start_Bet() throws InterruptedException {

        firstBetableRace.click();

    }

    }
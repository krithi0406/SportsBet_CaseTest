package Steps;
import actions.common_actions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends common_actions {


    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.quit();
    }
}
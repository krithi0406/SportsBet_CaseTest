package actions;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class common_actions  {
public static WebDriver driver;


    public enum Pather {
        id,
        className,
        name,
        xPath,
        cssSelector,
        linkText
    }

    public enum TimeOut {
        LOW(5),
        MIDDLE(10),
        HIGH(15),
        CUSTOM_MAX(60);
        private final int value;

        public int getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(int value) {
            this.value = value;
        }

    }


    public static void waitElement(WebElement element, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception ex) {

        }

    }
    public static WebElement selectOtherRunner(String search)

    {
        return driver.findElement(By.xpath("(//div[@data-automation-id=\"racecard-outcome-name\"]//SPAN[contains(@class,'Endeavour')][not(contains(text(),'"+search+"'))]/../../..//div[contains(@class,'priceButtonContentSingleLine')])[1]"));
    }
    public static WebElement otherRunnerName(String search)

    {
        return driver.findElement(By.xpath("(//div[@data-automation-id=\"racecard-outcome-name\"]//SPAN[contains(@class,'Endeavour')][not(contains(text(),'"+search+"'))])[1]"));
    }





    public static void findElementClick(String path, Pather type) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            switch (type) {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                    break;
                default:
                    new NotFoundException();
            }

        } catch (Exception ex) {
        }
    }

    public static WebElement findElement(String path, Pather type, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            return null;
        }
    }

    public WebElement findElement(String path, Pather type, String description) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }


    public void PageScrolldown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)", "");

    }

    public void PageScrollup() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)", "");
    }



    public static void navigateToUrl(String url) {
        driver.get(url);
    }

    public static void changeScreenDimension(int width) {
        Dimension dimension = new Dimension(width, 720);
        driver.manage().window().setSize(dimension);
    }

    public Object get_PageTitle() {
        driver.getTitle();
        return null;
    }

}

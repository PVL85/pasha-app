package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by paul on 14/09/2015.
 */
public class MainPage {

    private WebDriver driver;
    private final By miniCart = By.className("#hCart");
     private final By miniCartEmptyText = By.className("mcEmptyCart");

    public MainPage openMainPage() {
        driver = new FirefoxDriver();
            driver.get("http://www.crocs.eu");
        return this;
    }

    public MainPage moveMouseOnCart() {
           Actions action = new Actions(driver);
           WebElement we = driver.findElement(miniCart);
            action.moveToElement(we).build().perform();
        return this;
    }
     public String getMiniCartText() throws InterruptedException {
        // Thread.sleep(6000);
         moveMouseOnCart();
         return driver.findElement(miniCartEmptyText).getText();
     }

    public void closeDriver()    {
        driver.close();
    }
}

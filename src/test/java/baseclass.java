import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {

    protected WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

    // Common actions for interacting with elements
    protected WebElement findElement(By by) {
        return driver.findElement(by);
    }

    protected void clickElement(By by) {
        findElement(by).click();
    }

    protected void sendKeysToElement(By by, String text) {
        findElement(by).sendKeys(text);
    }

    // Wait for elements to be present and clickable
    protected void waitForElementToBeClickable(By by, Duration timeout) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

}

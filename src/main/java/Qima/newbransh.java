package Qima;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newbransh {

    protected WebDriver driver;

    public void BasePage() {
        // Set up WebDriver (adjust for different browsers)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Maximize browser window for consistency
        driver.manage().window().maximize();
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

    // Close the browser
    public void closeBrowser() {
        driver.quit();
    }

}

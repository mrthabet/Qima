package Qima;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	protected WebDriver driver;

   // @FindBy(cssSelector = "a[href='/logout']")
    private WebElement logoutLink;
    
    public static void setup() {
		//WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
	    // إنشاء متصفح Chrome
	    ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
	    driver.get("https://iso.digitaltransformationinstitute.org:11102");
		}

		public static WebDriver getDriver() {
	        return getDriver();
	    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout() {
        logoutLink.click();
    }
	

}

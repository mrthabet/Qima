package Qima;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private WebDriver driver;

    @FindBy(css = "a[href='/frameworks']")
    private WebElement frameworksLink;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickFrameworksLink() {
        frameworksLink.click();
    }

	//public void clickFrameworksLink1() {
		// TODO Auto-generated method stub
		
	

	//public void clickFrameworksLink1() {
		// TODO Auto-generated method stub
		
	}

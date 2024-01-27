package Qima;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameElement;

    @FindBy(id = "password")
    private WebElement passwordElement;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void login(String username, String password) {
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButton.click();
    }
    public HomePage navigateToHomePage() {
        return new HomePage(driver);
    }

	public HomePage navigateToHomePage1() {
		// TODO Auto-generated method stub
		return null;
	}
}



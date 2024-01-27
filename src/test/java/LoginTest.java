import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Qima.HomePage;
import Qima.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class LoginTest {
	public void testLogin() {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		WebDriverManager.chromedriver().setup();
	    // إنشاء متصفح Chrome
	    ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

        // Create a new WebDriver instance
      // WebDriver driver = new ChromeDriver();

        // Create a new LoginPage instance
        LoginPage loginPage = new LoginPage(driver);

        // Login to the system
        loginPage.login("your_username", "your_password");

        // Navigate to the Home Page
      //  HomePage homePage = loginPage.navigateToHomePage();

        // Click on the Frameworks link
       // homePage.clickFrameworksLink1();

        // Close the browser
        driver.quit();
    }
}



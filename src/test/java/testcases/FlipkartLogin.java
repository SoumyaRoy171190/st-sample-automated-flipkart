package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import pageobjects.LoginFlipkartPage;

@Listeners(commonListeners.CommonListener.class)
public class FlipkartLogin {

	public static WebDriver driver;

	
	public static void main (String[] args) {

		driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		LoginFlipkartPage login_FlipkartPage = PageFactory.initElements(driver, LoginFlipkartPage.class);
		login_FlipkartPage.loginToFlipkart(driver);
	}
}

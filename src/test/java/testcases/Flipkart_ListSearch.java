package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.LoginFlipkartPage;

public class Flipkart_ListSearch {

	WebDriver driver;
	String flipkartUrl = "http://www.flipkart.com/";
	String expectedSearchText = "Women";

	@Test
	public void clickOnitem () {
		
		/**
		 * Flipkart Opening
		 */
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(flipkartUrl);
		
		/**
		 * Login to Flipkart
		 */
		LoginFlipkartPage login_flipkartPage = PageFactory.initElements(driver, LoginFlipkartPage.class);
		login_flipkartPage.loginToFlipkart(driver);
		
		/**
		 * Click on List Search Result = "Women"
		 */
		WebElement parentList = driver.findElement(By.xpath("//div[@id='container']//header/div[3]/div/ul"));
		List<WebElement> elemList = parentList.findElements(By.xpath("./li"));
		

		for(int i = 1 ; i<= elemList.size(); i++) {
			
			WebElement listItem = driver.findElement(By.xpath("//div[@id='container']//header/div[3]/div/ul/li[" + i + "]/a//span"));
			String listItemName = listItem.getText().toString();
			System.out.println("Currently in ListItem : " + listItemName + " indexed at : " + i);
			if(listItemName.contentEquals(expectedSearchText)) {
				System.out.println(i);
				listItem.click();
				break;
			}
		}
	}
}

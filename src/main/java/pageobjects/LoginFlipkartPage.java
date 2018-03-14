package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFlipkartPage {
	
	@FindBy(xpath = "//a[contains(text(),'Login & Signup')]")
	WebElement loginSingUpLink;
	
	@FindBy(xpath = "//div[1]/input[contains(@class,'zrpKA')]")
	WebElement phoneFlipkartEmailTextBox;
	
	@FindBy(how = How.XPATH, using = "//div[2]/input[contains(@class,'zrpKA')]")
	WebElement passwordTextBox;
	
	@FindBy(how = How.XPATH, using = "//div[1]/input[contains(@class,'zrpKA')]/../../div[3]/button")
	WebElement loginFlipkartBtn;
	
	public void loginToFlipkart(WebDriver driver) {
	//	loginSingUpLink.click();
		phoneFlipkartEmailTextBox.click();
		phoneFlipkartEmailTextBox.sendKeys("9874937514");
		passwordTextBox.click();
		passwordTextBox.sendKeys("soumya171190");
		loginFlipkartBtn.click();
		System.out.println("PageTitle :" + driver.getTitle());
		}
}

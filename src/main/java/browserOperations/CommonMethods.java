package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods implements CommonBrowserOperationClass{

	public void enterData(String value, WebElement elem) {
		
		elem.sendKeys(value);
	}

	public void click(WebElement elem) {
		
		elem.click();
	}

	public void submit(WebElement elem) {
		
		elem.submit();
	}

	public void doubleClick(WebDriver driver, WebElement elem) {
		
		Actions builder = new Actions(driver);
		builder.doubleClick(elem);
	}

	public void mouseHover(WebDriver driver, WebElement elem) {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elem).clickAndHold().build().perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement elem) {
		// TODO Auto-generated method stub
		
	}

	public String getText(WebElement elem) {
		
		return elem.getText().toString();
	}

	public String getAttribute(String attValue, WebElement elem) {
		
		return elem.getAttribute(attValue).toString();
	}

	public void clear(WebElement elem) {
		
		elem.click();
	}

	public void selectDropDownByIndex(int index, WebElement elem) {
		
		Select sel = new Select(elem);
		sel.selectByIndex(index);
	}

	public void selectDropDownByVisibleText(String text, WebElement elem) {
		
		Select sel = new Select(elem);
		sel.selectByVisibleText(text);
	}

	public void selectDropDownByValue(String value, WebElement elem) {
		
		Select sel = new Select(elem);
		sel.deselectByValue(value);
	}

}

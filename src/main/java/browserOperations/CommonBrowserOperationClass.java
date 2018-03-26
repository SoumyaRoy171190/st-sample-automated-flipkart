package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface CommonBrowserOperationClass {

	public abstract void enterData(String value, WebElement elem);

	public abstract void click(WebElement elem);

	public abstract void submit(WebElement elem);

	public abstract void clear(WebElement elem);

	public abstract void selectDropDownByIndex(int index, WebElement elem);

	public abstract void selectDropDownByVisibleText(String text, WebElement elem);

	public abstract void selectDropDownByValue(String value, WebElement elem);

	public abstract void doubleClick(WebDriver driver, WebElement elem);

	public abstract void mouseHover(WebDriver driver, WebElement elem);

	public abstract void dragAndDrop(WebDriver driver, WebElement elem);

	public abstract String getText(WebElement elem);

	public abstract String getAttribute(String attValue, WebElement elem);
}

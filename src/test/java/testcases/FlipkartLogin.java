package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LoginFlipkartPage;

@Listeners(commonListeners.CommonListener.class)
public class FlipkartLogin {

	public WebDriver driver;

	
	@Test
	public void login() {

		driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		/**
		 * Page Factory initializes the POM, now the format is you have to take a page library variable as a page class
		 */
		LoginFlipkartPage pageClass; 
		pageClass = PageFactory.initElements(driver, LoginFlipkartPage.class);
		pageClass.loginToFlipkart(driver);
		/*
		LoginFlipkartPage login_FlipkartPage = PageFactory.initElements(driver, LoginFlipkartPage.class);
		login_FlipkartPage.loginToFlipkart(driver);*/
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void executionStatus(ITestResult result) throws IOException {

		if (result.isSuccess()) {

			File desc = new File("C:\\Users\\SoumyaRoy\\Desktop\\Me\\screenshots\\screenshot_"+result.getName()+"_002.png");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, desc);
		}
	}
	
	@AfterMethod
	public void failurePoint(ITestResult result) throws Exception {

		if (!result.isSuccess()) {

			File desc = new File("C:\\Users\\SoumyaRoy\\Desktop\\Me\\screenshots\\screenshot_error"+result.getName()+"_002.png");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, desc);
		}
	}
}

package pom.alert.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class AlertPage extends GenericWrrappers{

	public AlertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public AlertPage switchToAlertWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AlertPage switchToNextFrame() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		switchFrameById("iframeResult");
		return this;
	}
	
	public AlertPage clickTryItButton() {
		WebElement wb = driver.findElementByXPath("/html/body/button");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		clickByXpathNoSnap("/html/body/button"); 
		return this;
	}
	
	public AlertPage getAlertMsg() {
		getAlertText();
		return this;
	}
	
	public AlertPage enterTextInAlertBox(String text) {
		enterTextInAlert(text);
		return this;
	}
	
	public AlertPage clickOkButton() {
		acceptAlert();
		return this;
	}
	
	public AlertPage verifyOkAlertMsg(String text) {
		verifyTextById("demo", text);
		return this;
	}
	
	public AlertPage verifyTextContainsInOkMsg(String text) {
		verifyTextContainsByXpath("//p[@id = 'demo']", text);
		return this;
	}
	
	public AlertPage clickCancelButton() {
		dismissAlert();
		return this;
	}
	
	public AlertPage verifyDismissAlertMsg(String text) {
		verifyTextByXpath("//p[@id = 'demo']", text);
		return this;
	}
	
	public AlertPage verifyTextContainsInCancelMsg(String text) {
		verifyTextByXpath("//p[@id = 'demo']", text);
		return this;
	}
	
	public  AlertPage clickRefresh() {
		refreshWindow();
		return this;
	}
	public AlertPage switchFrame() {
		switchMainFrame();
		return this;
	}
	
	public HomePage clickHomeIcon() {
		clickByXpath("//a[@id = 'tryhome']");
		return new HomePage(driver, test);
	}
	
	
}

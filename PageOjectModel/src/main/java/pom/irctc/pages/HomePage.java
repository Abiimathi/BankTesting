package pom.irctc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class HomePage extends GenericWrrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public Registration clcikRegisterLink() {
		waittime(2000);
		clickByLink("REGISTER");
		return new Registration(driver, test);
	}
	
	public HomePage mouseHoverHolidays() {
		WebElement wb = driver.findElementByXPath("//a[text() = ' HOLIDAYS ']");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(wb));
		mouseHoverByXpath("//a[text() = ' HOLIDAYS ']");
		return this;
	}
	
	public HomePage mouseHoverStays() {
		mouseHoverByXpath("//*[text() = 'Stays']");
		return this;
	}
	
	public AccommodationPage clickLoungelink() {
		clickByXpath("//*[text() = 'Lounge']");
		return new AccommodationPage(driver, test);
	}
}

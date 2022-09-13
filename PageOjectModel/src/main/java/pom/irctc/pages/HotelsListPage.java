package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class HotelsListPage extends GenericWrrappers{
	
	public HotelsListPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public HotelsListPage switchtoHotelListWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelDetailsPage selectHotel() {
		/*WebElement wb = driver.findElementByXPath("(//div[@class ='right-searchpack'])[1]");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(wb));*/
		clickByXpath("(//div[@class ='right-searchpack'])[1]");
		return new HotelDetailsPage(driver, test);
	}
}

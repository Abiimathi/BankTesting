package pom.irctc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class CovidAlertPage extends GenericWrrappers {

	public CovidAlertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage acceptCovidAlert()
	{
			WebElement wb = driver.findElementByXPath("//button[@class='btn btn-primary']");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(wb));
			clickByXpath("//button[@class='btn btn-primary']");
			return new HomePage(driver, test);
	}
}

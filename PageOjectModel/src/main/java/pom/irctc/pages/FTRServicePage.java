package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class FTRServicePage extends GenericWrrappers{

	public FTRServicePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public FTRServicePage switchtoBookCoachWindow() {
		switchToLastWindow();
		return this;
	}
	
	public FtrUserRegPage clickSignup() {
		clickByXpath("//a[text() = 'New User? Signup']");
		return new FtrUserRegPage(driver, test);
	}
	
	
}

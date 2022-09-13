package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class FBLoginPage extends GenericWrrappers{

	public FBLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public FBSignUpPage clickCreateNewAccount() {
		clickByXpath("//a[text() = 'Create New Account']");
		return new FBSignUpPage(driver, test);
	}
}

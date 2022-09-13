package pom.indianform.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class Signup extends GenericWrrappers{

	public Signup(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public UserRegistration clickSignup() {
		clickByXpath("//a [text() = 'Sign Up (Registration)']");
		return new UserRegistration(driver, test);
	}
	
}

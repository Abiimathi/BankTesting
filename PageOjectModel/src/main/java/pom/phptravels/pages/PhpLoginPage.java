package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class PhpLoginPage extends GenericWrrappers{

	public PhpLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public PhpRegisterPage clickOnRegister() {
		
		clickByXpath("//span [text() = 'Register']");
		return new PhpRegisterPage(driver,test);
	}
	
	
}

package pom.alert.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class AlertMainPage extends GenericWrrappers{
	
	public AlertMainPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public AlertPage clickSimpleAlertLink() {
		clickByXpath("(//a[@target = '_blank' and text() = 'Try it Yourself »'])[1]");
		return new AlertPage(driver,test);
	}
	
	public AlertPage clickConfirmAlertLink() {
		clickByXpath("(//a[@target = '_blank' and text() = 'Try it Yourself »'])[2]");
		return new AlertPage(driver,test);
	}
	
	public AlertPage clickPromptAlertLink() {
		clickByXpath("(//a[@target = '_blank' and text() = 'Try it Yourself »'])[3]");
		return new AlertPage(driver,test);
	}

	
}

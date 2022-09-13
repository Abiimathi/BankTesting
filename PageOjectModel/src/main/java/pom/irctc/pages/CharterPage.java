package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class CharterPage extends GenericWrrappers{

	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public CharterPage switchtoCharterWindow() {
		switchToLastWindow();
		return this;
	}
	
	public CharterEnquiryFormPage clickEnqForm() {
		clickByXpath("//a [text() = 'Enquiry Form']");
		return new CharterEnquiryFormPage(driver, test);
	}

}

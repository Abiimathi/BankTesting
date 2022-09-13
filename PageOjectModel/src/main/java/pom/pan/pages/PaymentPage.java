package pom.pan.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class PaymentPage extends GenericWrrappers{

	public PaymentPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	public PaymentPage switchToPayWindow() {
		switchToLastWindow();
		return this;
	}
	
	public  PaymentPage getOrderId() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getTextByXpath("//*[@id='msform']/div[2]");
		return this;
	}
	
}
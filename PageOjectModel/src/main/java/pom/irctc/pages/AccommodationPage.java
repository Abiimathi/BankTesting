package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class AccommodationPage extends GenericWrrappers{

	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public AccommodationPage switchtoAccWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage clickSidebar() {
		clickByXpath("//a[@id = 'sidebarCollapse']");
		return this;
	}
	
	public FTRServicePage clickBookCoach() {
		clickByXpath("//a [contains(text(), 'Book Your Coach/Train')]");
		return new FTRServicePage(driver, test);
	}
	
	public CharterPage clickCharter() {
		clickByXpath("//a [contains(text(), 'Charter')]");
		return new CharterPage(driver, test);
	}
	
	public HotelsPage clickHotels() {
		clickByXpath("//a [text() = 'Hotels']");
		return new HotelsPage(driver, test);
	}


}

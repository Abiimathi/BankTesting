package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class CharterEnquiryFormPage extends GenericWrrappers{

	public CharterEnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public CharterEnquiryFormPage minimizeSidBar() {
		clickByXpath("//div[@id = 'dismiss']");
		return this;
	}
	
	public CharterEnquiryFormPage enterName(String name) {
		enterByXpath("//input[@name = 'name']", name);
		return this;
	}
	
	public CharterEnquiryFormPage enterOrg(String org) {
		enterByXpath("//input[@name = 'organization']", org);
		return this;
	}
	
	public CharterEnquiryFormPage enterAddress(String add) {
		enterByXpath("//input[@name = 'address']", add);
		return this;
	}
	
	public CharterEnquiryFormPage enterMobile(String mobile) {
		enterByXpath("//input[@name = 'mobile']", mobile);
		return this;
	}
	
	public CharterEnquiryFormPage enterEmail(String email) {
		enterByXpath("//input[@name = 'email']", email);
		return this;
	}
	
	public CharterEnquiryFormPage reqFor(String request) {
		int req = Integer.parseInt(request);
		selectIndexByXpath("//select[@name = 'requestFor']", req);
		return this;
	}
	
	public CharterEnquiryFormPage orginStation(String orgstate) {
		enterByXpath("//input[@name = 'originStation']", orgstate);
		return this;
	}
	
	public CharterEnquiryFormPage destination(String deststate) {
		enterByXpath("//input[@name = 'destnStation']", deststate);
		return this;
	}
	
	public CharterEnquiryFormPage clickDateOfDep() {
		clickByXpath("//input[@name = 'checkInDate']");
		return this;
	}
	
	public CharterEnquiryFormPage clickNextDepMonth() {
		clickByXpath("//*[starts-with(@class,'fa fa-angle-right')]");;
		return this;
	}
	
	public CharterEnquiryFormPage selectDepDate(String date) {
		clickByXpath("//span[@class= 'act' and text()='"+date+"']");
		return this;
	}
	
	public CharterEnquiryFormPage clickDateOfArr() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickByXpath("//input[@name = 'checkOutDate']");
		return this;
	}
	
	public CharterEnquiryFormPage clickNextArrMonth() {
		clickByXpath("(//*[starts-with(@class,'fa fa-angle-right')])[2]");;
		return this;
	}
	
	public CharterEnquiryFormPage selectArrDate(String date) {
		clickByXpath("(//span[@class= 'act' and text()='"+date+"'])[2]");
		return this;
	}
	
	public CharterEnquiryFormPage enterDuration(String days) {
		enterByXpath("//input[@name = 'durationPeriod']", days);
		return this;
	}
	
	public CharterEnquiryFormPage enterCoachDetais(String coach) {
		enterByXpath("//input[@name = 'coachDetails']", coach);
		return this;
	}
	
	public CharterEnquiryFormPage enterNoOfPass(String passno) {
		enterByXpath("//input[@name = 'numPassenger']", passno);
		return this;
	}
	
	public CharterEnquiryFormPage enterCharter(String charter) {
		enterByXpath("//textarea[@name = 'charterPurpose']", charter);
		return this;
	}
	
	public CharterEnquiryFormPage enterService(String service) {
		enterByXpath("//textarea[@name = 'services']", service);
		return this;
	}
	
	public CharterEnquiryFormPage clickSubmit() {
		clickByXpath("//button[@type = 'Submit']");
		return this;
	}
	
	public CharterEnquiryFormPage MobileNoError() {
		enterByXpath("//input[@name= 'mobile']", Keys.PAGE_UP, "PageUP");
		return this;
	}
	
	
	public CharterEnquiryFormPage verifyMobileNoError(String text) {
		verifyTextByXpath("//input[@name= 'mobile']//following-sibling::span", text);
		return this;
	}
	
}

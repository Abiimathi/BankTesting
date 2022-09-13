package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class HotelDetailsPage extends GenericWrrappers{

	String hotelname = null;
	String hotelAmount = null;
	
	public HotelDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HotelDetailsPage switchtoHotelDetailsWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelDetailsPage getHotelName() {
		WebElement wb = driver.findElementByXPath("//div[@class = 'mid-searchpack']/h5");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		hotelname = getTextByXpath("//div[@class = 'mid-searchpack']/h5");
		return this;
	}
	
	public HotelDetailsPage getHotelAmount() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hotelAmount = getTextByXpath("//*[contains (@class, 'standard-price')]/div/div[2]/strong");
		return this;
	}
	
	public HotelDetailsPage clickContinueToBook() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickByXpath("(//button[@type='button']//following-sibling::i)[2]");
		return this;
	}
	
	public HotelDetailsPage selectTitle(String title) {
		selectVisibileTextByXpath("//select[@name = 'title']", title);
		return this;
	}
	
	public HotelDetailsPage enterFirstName(String fname) {
		enterByXpath("//input[@name = 'firstName']", fname);
		return this;
	}
	
	public HotelDetailsPage enterLasttName(String lname) {
		enterByXpath("//input[@name = 'lastName']", lname);
		return this;
	}
	
	public HotelDetailsPage selectState(String state) {
		selectValueByXpath("//select[@name = 'state']", state );
		return this;
	}
	
	public HotelDetailsPage selectGst(String GST) {
		int Gstindex = Integer.parseInt(GST);
		selectIndexByXpath("//select[@name = 'gst']", Gstindex);
		return this;
	}
	
	public HotelDetailsPage enterGstNumber(String gstno) {
		enterByXpath("//input[@name = 'gstNumber']", gstno);
		return this;
	}
	
	public HotelDetailsPage enterComName(String comname) {
		enterByXpath("//input[@name = 'companyName']", comname);
		return this;
	}
	
	public HotelDetailsPage enterComAdd(String comadd) {
		enterByXpath("//input[@name = 'companyAddress']", comadd);
		return this;
	}
	
	public HotelDetailsPage verifyGSTError(String errmsg) {
		verifyTextByXpath("//input[@name= 'gstNumber'] //following-sibling::span", errmsg);
		return this;
	}
	
	public HotelDetailsPage verifyHotelName() {
		verifyTextByXpath("//div[@class = 'mid-searchpack']/h5",hotelname);
		return this;
	}
	
	public HotelDetailsPage verifyHotelAmount() {
		verifyTextByXpath("//div[contains(@class,'faredetails-in-total')]/strong",hotelAmount);
		return this;
	}
	
	public HotelDetailsPage scrollDown() {
		enterByXpath("//html/body", Keys.PAGE_DOWN, "PageDown");
		return this;
	}
	
	public HotelDetailsPage clickContinue() {
		/*WebElement wb = driver.findElementByXPath("//button[@type = 'button' and text() = 'Continue']");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));*/
		clickByXpath("//button[@type = 'button' and text() = 'Continue']");
		return this;
	}
	
	public HotelDetailsPage checkTermsCheckBox() {
		WebElement wb = driver.findElementByXPath("//span[@class= 'checkmark']");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
		clickByXpath("//span[@class= 'checkmark']");
		return this;
	}
	
	public HotelDetailsPage clickMakePayement() {
		clickByXpath("//button[@type = 'button' and text() = 'Make Payment']");
		return this;
	}
	
	public HotelDetailsPage clickVerify() {
		WebElement wb = driver.findElementByXPath("//button[@type = 'button' and text() = 'Verify']");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
		clickByXpath("//button[@type = 'button' and text() = 'Verify']");
		return this;
	}
	
	public HotelDetailsPage verifyOTPError(String errmsg) {
		verifyTextByXpath("//input[@name= 'otp'] //following-sibling::span", errmsg);
		return this;
	}
	
}


package pom.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class PhpRegisterPage extends GenericWrrappers{
	

	public PhpRegisterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public PhpRegisterPage switchToRegWindow() {
		switchToLastWindow();
		return this;
	}
	
	public PhpRegisterPage enterFirstName(String fname) {
		enterByXpath("//input[@id = 'inputFirstName']", fname);
		return this;
	}
	
	public PhpRegisterPage enterLastName(String lname) {
		enterByXpath("//input[@id = 'inputLastName']", lname);
		return this;
	}
	
	public PhpRegisterPage enterEmail(String email) {
		enterByXpath("//input[@id = 'inputEmail']", email);
		return this;
	}
	
	public PhpRegisterPage clickonCountry() {
		clickByXpath("//div[@class = 'iti-arrow']");
		return this;
	}
	
	public PhpRegisterPage selectCountrycode(String countrycode) {
		WebElement wb = driver.findElementByXPath("//span[@class= 'dial-code' and text() = '+91']");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(wb));
		//clickByXpath("//li[@data-dial-code= '"+countrycode+"']");
		clickByXpath("//span[@class= 'dial-code' and text() = '+91' ]");
		return this;
	}
		
	public PhpRegisterPage enterPhone(String phone) {
		enterByXpath("//input[@id = 'inputPhone']", phone);
		return this;
	}
	
	public PhpRegisterPage enterCompName(String cname) {
		enterByXpath("//input[@id = 'inputCompanyName']", cname);
		return this;
	}
	
	public PhpRegisterPage enterAdd1(String add1) {
		enterByXpath("//input[@id = 'inputAddress1']", add1);
		return this;
	}
	
	public PhpRegisterPage enterAdd2(String add2) {
		enterByXpath("//input[@id = 'inputAddress2']", add2);
		return this;
	}
	
	public PhpRegisterPage enterCity(String city) {
		enterByXpath("//input[@id = 'inputCity']", city);
		return this;
	}
	
	public PhpRegisterPage enterState(String state) {
		enterByXpath("//input[@id = 'stateinput']", state);
		return this;
	}

	public PhpRegisterPage enterPost(String post) {
		enterByXpath("//input[@id = 'inputPostcode']", post);
		return this;
	}
	
	
	public PhpRegisterPage selectCountry(String country) {
		WebElement wb = driver.findElementById("inputCountry");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		selectValueByXpath("//select[@id = 'inputCountry']", country);
		return this;
	}
	
	public PhpRegisterPage enterMobile(String mobile) {
		enterByXpath("//input[@id = 'customfield2']", mobile);
		return this;
	}
	
	public PhpRegisterPage clickGenPwdBtn() {
		clickByXpath("//button[contains(@class, 'generate-password')]");
		return this;
	}
	
	public PhpRegisterPage clearPwd() {
		clearById("inputGeneratePasswordLength");
		return this;
	}
	
	public PhpRegisterPage enterPwdLength(String length) {
		enterByXpath("//input[@id = 'inputGeneratePasswordLength']", length);
		return this;
	}
	
	public PhpRegisterPage clickGenPwd() {
		clickByXpath("//button[@type = 'submit']");
		return this;
	}
	
	public PhpRegisterPage copyPwd() {
		 clickByXpath("//button[@id = 'btnGeneratePasswordInsert']");
		 return this;
	}
	
	public PhpRegisterPage turnOffEmail() {
		clickByXpath("//span[@class= 'switch__handle']");
		return this;
	}

}

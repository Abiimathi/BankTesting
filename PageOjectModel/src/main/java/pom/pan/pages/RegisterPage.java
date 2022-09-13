package pom.pan.pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class RegisterPage extends GenericWrrappers{

	public RegisterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public RegisterPage selectTitle(int title) {
		selectIndexByXpath("//select[@id = 'pan_title']", title);
		return this;
	}
	
	public RegisterPage enterFirstName(String fname) {
		enterByXpath("//input[@id = 'pan_firstname']", fname);
		return this;
	}
	
	public RegisterPage enterMiddleName(String mname) {
		enterByXpath("//input[@id = 'pan_middlename']", mname);
		return this;
	}
	
	public RegisterPage enterLastName(String lname) {
		enterByXpath("//input[@id = 'pan_lastname']", lname);
		return this;
	}
	

	public RegisterPage enterFatFirstName(String ffname) {
		enterByXpath("//input[@id = 'pan_fatherfirstname']", ffname);
		return this;
	}
	
	public RegisterPage enterFatMiddleName(String fmname) {
		enterByXpath("//input[@id = 'pan_fathermiddlename']", fmname);
		return this;
	}
	
	public RegisterPage enterFatLastName(String flname) {
		enterByXpath("//input[@id = 'pan_fatherlastname']", flname);
		return this;
	}
	
	public RegisterPage enterMobile(String mobile) {
		enterByXpath("//input[@name = 'pan_mobilenumber']", mobile);
		return this;
	}
	
	public RegisterPage enterMail(String mail) {
		enterByXpath("//input[@name = 'pan_email']", mail);
		return this;
	}
	
	public RegisterPage selectIncome(String income) {
		selectValueByXpath("//select[@id = 'pan_sourceofincome']", income);
		return this;
	}
	
	public RegisterPage selectAddforComm(int data) {
		clickByXpath("//input[@name = 'pan_communication' and @value = '"+data+"']");
		return this;
	}
	
	public RegisterPage enterDOBdob(String dob) {
		enterByXpath("//input[@id = 'pan_dob']", dob);
		return this;
	}
	
	public RegisterPage clickPageDown() {
		enterByXpath("//html/body", Keys.PAGE_DOWN, "PageDown");
		return this;
	}
	
	public RegisterPage enterAdd1(String add1) {
		enterByXpath("//input[@name= 'pan_addressline1']", add1);
		return this;
	}
	
	public RegisterPage enterAdd2(String add2) {
		enterByXpath("//input[@name= 'pan_addressline2']", add2);
		return this;
	}
	
	public RegisterPage enterCity(String city) {
		enterByXpath("//input[@name= 'pan_cityname']", city);
		return this;
	}
	
	public RegisterPage selectState(String state) {
		selectValueByXpath("//select[@id = 'pan_state']", state);
		return this;
	}
	
	public RegisterPage enterZip(String zip) {
		enterByXpath("//input[@id = 'pan_pincode']", zip);
		return this;
	}
	
	public RegisterPage selectCountry(int con) {
		selectIndexByXpath("//select[@id = 'pan_country']", con);
		return this;
	}
	
	public RegisterPage selectIdProof(String idproof) {
		selectValueByXpath("//select[@id = 'pan_identityproof']", idproof);
		return this;
	}
	
	public RegisterPage selectAddProof(String addproof) {
		selectValueByXpath("//select[@id = 'pan_addressproof']", addproof);
		return this;
	}
	
	public RegisterPage selectDobProof(String dobproof) {
		selectValueByXpath("//select[@id = 'pan_DOBproof']", dobproof);
		return this;
	}
	
	public RegisterPage selectAdhProof(String adhproof) {
		selectValueByXpath("//select[@id = 'pan_aadhaarproof']", adhproof);
		return this;
	}
	
	public RegisterPage clickAgree() {
		clickByXpath("//input[@id = 'pan_source']");
		return this;
	}
	
	public RegisterPage getText()
	{
		getTextByXpath("//div[@class = 'col-sm-12' ][2]");
		return this;
	}
	
	public PaymentPage clickNextbtn() {
		clickByXpath("//input[@value= 'Next']");
		return new PaymentPage(driver, test);
	}
	
}

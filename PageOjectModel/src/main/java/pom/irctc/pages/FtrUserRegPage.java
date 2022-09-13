package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class FtrUserRegPage extends GenericWrrappers{

	public FtrUserRegPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	public FtrUserRegPage enterUserId(String userid) {
		enterByXpath("//input[@id = 'userId']", userid);
		return this;
	}
	
	public FtrUserRegPage enterPwd(String pwd) {
		enterByXpath("//input[@id = 'password']", pwd);
		return this;
	}
	
	public FtrUserRegPage enterCnfPwd(String cnfpwd) {
		enterByXpath("//input[@id = 'cnfPassword']", cnfpwd);
		return this;
	}
	
	public FtrUserRegPage selectSecQues(String secque) {
		int secretques = Integer.parseInt(secque);
		selectIndexByXpath("//select[@id = 'secQstn']", secretques);
		return this;
	}
	
	public FtrUserRegPage enterSecretAns(String secans) {
		enterByXpath("//input[@id = 'secAnswer']", secans);
		return this;
	}
	
	public FtrUserRegPage clickDOB() {
		clickByXpath("//input[@id = 'dateOfBirth']");
		return this;
	}
	
	public FtrUserRegPage selectYear(String year) {
		selectVisibileTextByXpath("//select[@data-handler= 'selectYear']", year);
		return this;
	}
	
	public FtrUserRegPage selectMonth(String month) {
		int monthdob = Integer.parseInt(month);
		selectIndexByXpath("//select[@data-handler= 'selectMonth']", monthdob);
		return this;
	}
	
	public FtrUserRegPage selectDate(String date) {
		clickByXpath("//a[@class='ui-state-default' and text() = '"+date+"']");
		return this;
	}
	
	public FtrUserRegPage selectGender(String gender) {
		clickByXpath("//input[@value = '"+gender+"']");
		return this;
	}
	
	public FtrUserRegPage selectMaritalStatus(String status) {
		clickByXpath("//input[@value='"+status+"']");
		return this;
	}
	
	public FtrUserRegPage enterEmail(String email) {
		enterByXpath("//input[@id = 'email']", email);
		return this;
	}
	
	public FtrUserRegPage enterOccupation(int occu) {
		//selectValueById("occupation", occu);
		selectIndexByXpath("//select[@id = 'occupation']", occu);
		return this;
	}
	
	public FtrUserRegPage enterFirstName(String fname) {
		enterByXpath("//input[@id = 'fname']", fname);
		return this;
	}
	
	public FtrUserRegPage enterMiddleName(String mname) {
		enterByXpath("//input[@id = 'mname']", mname);
		return this;
	}
	
	public FtrUserRegPage enterLastName(String lname) {
		enterByXpath("//input[@id = 'lname']", lname);
		return this;
	}
	
	public FtrUserRegPage selectNationality(String nationality) {
		selectValueByXpath("//select[@id = 'natinality']", nationality);
		return this;
	}
	
	public FtrUserRegPage enterFlatNo(String flat) {
		enterByXpath("//input[@id = 'flatNo']",flat);
		return this;
	}
	
	public FtrUserRegPage enterStreet(String street) {
		enterByXpath("//input[@id = 'street']", street);
		return this;
	}
	
	public FtrUserRegPage enterArea(String area) {
		enterByXpath("//input[@id = 'area']", area);
		return this;
	}
	
	public FtrUserRegPage clickCountry() {
		clickByXpath("//select[@id = 'country']");
		return this;
	}
	
	public FtrUserRegPage selectCountry(String country) {
		selectValueByXpath("//select[@id = 'country']", country);
		return this;
	}
	
	public FtrUserRegPage enterMobile(String mobile) {
		enterByXpath("//input[@id = 'mobile']", mobile);
		return this;
	}
	
	public FtrUserRegPage enterPincode(String pin) {
		enterByXpath("//input[@id = 'pincode']", pin);
		return this;
	}
	
	public FtrUserRegPage pressTab() {
		enterByXpath("//input[@id = 'pincode']", Keys.TAB, "Tab");
		return this;
	}
	
	public FtrUserRegPage selectPostOff(String post) {
		selectValueByXpath("//select[@id = 'postOffice']", post);
		return this;
	}
	
	public FtrUserRegPage clickComAddSameResAdd() {
		clickByXpath("//input[@id = 'sameAddresses1']");
		return this;
	}
	
	public FtrUserRegPage enterOffFlat(String offflat) {
		enterByXpath("//input[@id = 'flatNoOffice']", offflat);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}
	
	public FtrUserRegPage enterOffStreet(String offstreet) {
		enterByXpath("//input[@id = 'streetOffice']", offstreet);
		return this;
	}
	
	public FtrUserRegPage enterOffArea(String offarea) {
		enterByXpath("//input[@id = 'areaOffice']", offarea);
		return this;
	}
	
	public FtrUserRegPage selectOffCountry(String offcountry) {
		selectValueByXpath("//select[@id = 'countryOffice']", offcountry);
		return this;
	}
	
	public FtrUserRegPage enterOffMobile(String offmobile) {
		enterByXpath("//input[@id = 'mobileOffice']", offmobile);
		return this;
	}
	
	public FtrUserRegPage enterOffPin(String offpin) {
		enterByXpath("//input[@id = 'pincodeOffice']", offpin);
		return this;
		
	}
	
	public FtrUserRegPage selectOffPost(String offpost) {
		selectValueByXpath("//select[@id = 'postOfficeOffice']", offpost);
		return this;
	}
	
}


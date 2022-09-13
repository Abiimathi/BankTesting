package pom.indianform.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class UserRegistration extends GenericWrrappers{
	
	public UserRegistration(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public UserRegistration enterUserId(String uid) {
		enterByXpath("//input[@id = 'u_id']", uid);
		return this;
	}
	
	public UserRegistration enterPwd(String upwd) {
		enterByXpath("//input[@id = 'u_pwd']", upwd);
		return this;
	}
	
	public UserRegistration entercnfpwd(String repwd) {
		enterByXpath("//input[@id = 'u_repwd']", repwd);
		return this;
	}
	
	public UserRegistration selectSecQue(String secques) {
		int seqquestint = Integer.parseInt(secques);
		selectIndexByXpath("//select[@id = 'u_secques']", seqquestint);
		return this;
	}
	
	public UserRegistration enterSecAns(String secans) {
		enterByXpath("//input[@id = 'u_secans']", secans);
		return this;
	}
	
	public UserRegistration enterUserName(String uname) {
		enterByXpath("//input[@id = 'u_name']", uname);
		return this;
	}
	
	public UserRegistration selectGender(String gender) {
		selectValueByXpath("//select[@id = 'u_gender']", gender);
		return this;
	}
	
	public UserRegistration enterDOB(String dob) {
		enterByXpath("//input[@id = 'u_dob']", dob);
		return this;
	}
	
	public UserRegistration enterDesignation(String desgn) {
		enterByXpath("//input[@id = 'u_designation']", desgn);
		return this;
	}
	
	public UserRegistration enterEmail(String uemail) {
		enterByXpath("//input[@id = 'u_emailid']", uemail);
		return this;
	}
	
	public UserRegistration enterMobile(String umobile) {
		enterByXpath("//input[@id = 'u_mobile']", umobile);
		return this;
	}
	
	public UserRegistration enterPhone(String uphone) {
		enterByXpath("//input[@id = 'u_phone']", uphone);
		return this;
	}
	
	public UserRegistration enterNation(String nation) {
		selectValueByXpath("//select[@id = 'u_nationality']", nation);
		return this;
	}
	
	public UserRegistration entergName(String gname) {
		enterByXpath("//input[@id = 'name']", gname);
		return this;
	}
	
	public UserRegistration enterCapacity(String gcapacity) {
		enterByXpath("//input[@id = 'capacity']", gcapacity);
		return this;
	}
	
	public UserRegistration enterAddress(String gadd) {
		enterByXpath("//textarea[@id = 'address']", gadd);
		return this;
	}
	
	public UserRegistration selectState(String gstate) {
		selectVisibileTextByXpath("//select[@id = 'state']", gstate);
		return this;
	}
	
	public UserRegistration selectDist(int gdis)	{
		//int dis = Integer.parseInt(gdis);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city_distr")));
		selectIndexByXpath("//select[@id = 'city_distr']", gdis);
		return this;
	}	
	
	public UserRegistration selectAccType(String acctype) {
		selectValueByXpath("//select[@name = 'acco_type']", acctype);
		return this;
	}	
	
	public UserRegistration selectGrade(String grade) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("star_rat")));
		//waittime(2000);
		selectValueByXpath("//select[@name = 'star_rat']", grade);
		return this;
	}
	
	public UserRegistration enterGemail(String gemail) {
		enterByXpath("//input[@name = 'email']", gemail);
		return this;
	}
	
	public UserRegistration enterGmobile(String gmobile) {
		enterByXpath("//input[@name = 'mcontact']", gmobile);
		return this;
	}
	
	public UserRegistration enterGphone(String gphone) {
		enterByXpath("//input[@name = 'contact']", gphone);
		return this;
	}
	
	public UserRegistration enterO1name(String o1name)	{
		enterByXpath("//input[@name = 'name_o']", o1name);
		return this;
	}
	
	public UserRegistration enterO1add(String o1add){
		enterByXpath("//input[@name = 'address_o']", o1add);
		return this;
	}
	
	public UserRegistration selectO1State(String o1state) {
		selectVisibileTextByXpath("//select[@name = 'state_o']", o1state);
		return this;
	}
	
	public UserRegistration selectO1dis(String o1dist) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		selectValueByXpath("//select[@id = 'citydistr_o']", o1dist);
		return this;
	}
	
	public UserRegistration entero1email(String o1email) {
		enterByXpath("//input[@name = 'emailid_o']", o1email);
		return this;
	}
	
	public UserRegistration entero1phone(String o1phone) {
		enterByXpath("//input[@name = 'phoneno_o']", o1phone);
		return this;
	}
	
	public UserRegistration entero1mobile(String o1mobile) {
		enterByXpath("//input[@name = 'mobile_o']", o1mobile);
		return this;
	}
	
	public UserRegistration clickAddButton() {
		clickByXpath("//input[@name = 'add']");
		return this;
	}
	
	public UserRegistration enterO2name(String o2name)	{
		enterByXpath("//input[@name = 'name_o']", o2name);
		return this;
	}
	
	public UserRegistration enterO2add(String o2add){
		enterByXpath("//input[@name = 'address_o']", o2add);
		return this;
	}
	
	public UserRegistration selectO2State(String o2state) {
		selectVisibileTextByXpath("//select[@id = 'state_o']", o2state);
		return this;
	}
	
	public UserRegistration selectO2dis(String o2dist) {
		waittime(2000);
		selectValueByXpath("//select[@id = 'citydistr_o']", o2dist);
		return this;
	}
	
	public UserRegistration entero2email(String o2email) {
		enterByXpath("//input[@name = 'emailid_o']", o2email);
		return this;
	}
	
	public UserRegistration entero2phone(String o2phone) {
		enterByXpath("//input[@name = 'phoneno_o']", o2phone);
		return this;
	}
	
	public UserRegistration entero2mobile(String o2mobile) {
		enterByXpath("//input[@name = 'mobile_o']", o2mobile);
		return this;
	}
	
	public UserRegistration enterO3name(String o3name)	{
		enterByXpath("//input[@name = 'name_o']", o3name);
		return this;
	}
	
	public UserRegistration enterO3add(String o3add){
		enterByXpath("//input[@name = 'address_o']", o3add);
		return this;
	}
	
	public UserRegistration selectO3State(String o3state) {
		selectVisibileTextByXpath("//select[@id = 'state_o']", o3state);
		return this;
	}
	
	public UserRegistration selectO3dis(String o3dist) {
		waittime(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		selectValueByXpath("//select[@id = 'citydistr_o']", o3dist);
		return this;
	}
	
	public UserRegistration entero3email(String o3email) {
		enterByXpath("//input[@name = 'emailid_o']", o3email);
		return this;
	}
	
	public UserRegistration entero3phone(String o3phone) {
		enterByXpath("//input[@name = 'phoneno_o']", o3phone);
		return this;
	}
	
	public UserRegistration entero3mobile(String o3mobile) {
		enterByXpath("//input[@name = 'mobile_o']", o3mobile);
		return this;
	}
	
}

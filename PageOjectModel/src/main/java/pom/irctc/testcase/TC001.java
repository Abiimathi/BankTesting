package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.irctc.pages.CovidAlertPage;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC001";
		testCaseDescription = "To verify IRCTC Registration for New User";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.irctc.co.in/";
	}
	
	@Test
	public void irctcRegistration() {
	
		new CovidAlertPage(driver, test)
		.acceptCovidAlert() 
		.clcikRegisterLink()
		.enterUserName("Abimathi0918")
		.enterPswd("Mathi@0918")
		.enterCnfpwd("Mathi@0918")
		.clickPreferredLanguage()
		.selectPrefferedLanguage()
		.clickSequrityQuestion()
		.selectSecurityQuestion("What is your fathers middle name?")
		.enterSecurityAnswer("Pandi")
		.clickContinue()
		.enterFirstName("Abi")
		.enterMiddleName("Mathi")
		.enterLastName("Ilango")
		.clickOccupation()
		.selectOccupation("PUBLIC")
		.clickDOB()
		.selectYear("1994")
		.selectMonth("8")
		.selectDate("18")
		.selctMaritalStatus("married")
		.selectCountry("India")
		.selectGender("Female")
		.enterEmail("abi@gmail.com")
		.enterMobile("9809809800")
		.selectNationality("India")
		.clickContinue2()
		.enterResAdd1("No 315")
		.enterResAdd2("Kambar colony")
		.enterResAdd3("Anna Nagar")
		.enterResPin("600040")
		.clickcity()
		.selectCity("1")
		.selectPost("1")
		.enterResPhone("9098979098")
		.clickCopyResToOffAdd()
		.enteroffAdd1("No 21")
		.enteroffAdd2("Porur Gardens")
		.enteroffAdd3("Porur")
		.clickOnOffCountry()
		.selectOffCountry("India")
		.enterOffPin("600116")
		.enterOffState("Tamilnadu")
		.enteroffCity("Chennai")
		.enterOffPost("Chennai")
		.enterOffPhone("9874554789");
	}
}

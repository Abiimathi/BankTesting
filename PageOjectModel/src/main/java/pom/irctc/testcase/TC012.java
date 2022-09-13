package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.phptravels.pages.PhpLoginPage;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC012";
		testCaseDescription = "To verify user Registration for PHP Travels";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://phptravels.org/login";
	}
	
	@Test

	public void phpTravelsRegistration() {
		
		new PhpLoginPage(driver,test)
		.clickOnRegister()
		.switchToRegWindow()
		.enterFirstName("Abi")
		.enterLastName("Mathi")
		.enterEmail("abi@gmail.com")
		.clickonCountry()
		.selectCountrycode("+91")
		.enterPhone("9596979809")
		.enterCompName("CTS")
		.enterAdd1("234, 4th main road")
		.enterAdd2("OKKiyam,OMR")
		.enterCity("Chennai")
		.enterState("Tamil Nadu")
		.enterPost("600090")
		.selectCountry("IN")
		.enterMobile("8974587462")
		.clickGenPwdBtn()
		.clearPwd()
		.enterPwdLength("15")
		.clickGenPwd()
		.copyPwd()
		.turnOffEmail();
	}
}

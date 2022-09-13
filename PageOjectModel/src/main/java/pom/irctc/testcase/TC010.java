package pom.irctc.testcase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.facebook.pages.FBLoginPage;

public class TC010 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC010";
		testCaseDescription = "To verify FaceBook Registration for New User";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.facebook.com/";
	}
	
	@Test
	public void fbSignup() {
		
		new FBLoginPage(driver, test)
		.clickCreateNewAccount()
		.enterFirstName("Abi")
		.enterSurName("Ilango")
		.enterEmail("abi09@gmail.com")
		.enterCnfEmail("abi09@gmail.com")
		.enterPwd("M@thi0918")
		.selectDOBDate("18")
		.selectDOBMonth("9")
		.selectDOBYear("1994")
		.selectSex("1");
	}
}

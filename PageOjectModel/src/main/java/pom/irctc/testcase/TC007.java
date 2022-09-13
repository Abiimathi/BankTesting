package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.alert.pages.AlertMainPage;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC007";
		testCaseDescription = "To verify Simple Alert";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/js_popup.asp";
	}
	
	@Test
	public void simpleAlert() {
		
		new AlertMainPage(driver,test)
		.clickSimpleAlertLink()
		.switchToAlertWindow()
		.switchToNextFrame()
		.clickTryItButton()
		.getAlertMsg()
		.clickOkButton()
		.switchFrame()
		.clickHomeIcon()
		.switchHomewindow()
		.verifyText();
	}
}

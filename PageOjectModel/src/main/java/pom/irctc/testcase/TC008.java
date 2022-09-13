package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.alert.pages.AlertMainPage;

public class TC008 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC008";
		testCaseDescription = "To verify Confirmation Alert";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/js_popup.asp";
	}
	
	@Test
	public void promptAlert() {
		
		new AlertMainPage(driver,test)
		.clickConfirmAlertLink()
		.switchToAlertWindow()
		.switchToNextFrame()
		.clickTryItButton()
		.getAlertMsg()
		.clickOkButton()
		.verifyOkAlertMsg("You pressed OK!")
		.clickTryItButton()
		.getAlertMsg()
		.clickCancelButton()
		.verifyDismissAlertMsg("You pressed Cancel!")
		.switchFrame()
		.clickHomeIcon()
		.switchHomewindow()
		.verifyText();
	}
}

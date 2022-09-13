package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.alert.pages.AlertMainPage;

public class TC009 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC009";
		testCaseDescription = "To verify Prompt Alert";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/js_popup.asp";
	}
	
	@Test

	public void promptAlert() {
		
		new AlertMainPage(driver,test)
		.clickPromptAlertLink()
		.switchToAlertWindow()
		.switchToNextFrame()
		.clickTryItButton()
		.getAlertMsg()
		.enterTextInAlertBox("Abimathi")
		.clickOkButton()
		.verifyTextContainsInOkMsg("Abimathi")
		.clickRefresh()
		.switchToNextFrame()
		.clickTryItButton()
		.getAlertMsg()
		.enterTextInAlertBox("Heshu")
		.clickCancelButton()
		.verifyTextContainsInCancelMsg("Heshu")
		.switchFrame()
		.clickHomeIcon()
		.switchHomewindow()
		.verifyText();
		
	}
}

package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.irctc.pages.CovidAlertPage;

public class TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC003";
		testCaseDescription = "To verify error msg for invalid mobile numer in Charter Enquiry Form ";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.irctc.co.in/";
	}
	
	@Test
	public void enquiryForm() {
		
		new CovidAlertPage(driver, test)
		.acceptCovidAlert() 
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickLoungelink()
		.switchtoAccWindow()
		.clickSidebar()
		.clickCharter()
		.switchtoCharterWindow()
		.clickEnqForm()
		.minimizeSidBar()
		.enterName("Abimathi")
		.enterOrg("AXA")
		.enterAddress("315, 29th street, Chennai")
		.enterMobile("968574")
		.enterEmail("abi@gmail.com")
		.reqFor("1")
		.orginStation("Chennai")
		.destination("Mumbai")
		.clickDateOfDep()
		.clickNextDepMonth()
		.selectDepDate("5")
		.clickDateOfArr()
		.clickNextArrMonth()
		.selectArrDate("10")
		.enterDuration("5")
		.enterCoachDetais("1 3 TierAC Coach")
		.enterNoOfPass("10")
		.enterCharter("Meeting")
		.enterService("Lunch Required")
		.clickSubmit()
		.MobileNoError()
		.verifyMobileNoError("Mobile no. not valid");
		
	}
}

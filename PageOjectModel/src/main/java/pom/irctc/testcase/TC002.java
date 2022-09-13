package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.irctc.pages.CovidAlertPage;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC002";
		testCaseDescription = "To verify IRCTC Registration of New User for FTR Services";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.irctc.co.in/";
	}
	
	@Test
	public void ftrSignup() {
		
		new CovidAlertPage(driver, test)
		.acceptCovidAlert() 
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickLoungelink()
		.switchtoAccWindow()
		.clickSidebar()
		.clickBookCoach()
		.switchtoBookCoachWindow()
		.clickSignup()
		.enterUserId("Abi0918")
		.enterPwd("M@thi0918")
		.enterCnfPwd("M@thi0918")
		.selectSecQues("3")
		.enterSecretAns("Jackie")
		.clickDOB()
		.selectYear("1994")
		.selectMonth("8")
		.selectDate("18")
		.selectGender("F")
		.selectMaritalStatus("Married")
		.enterEmail("abi@gmail.com")
		.enterOccupation(2)
		.enterFirstName("Abi")
		.enterMiddleName("Mathi")
		.enterLastName("Ilango")
		.selectNationality("94")
		.enterFlatNo("No 315")
		.enterStreet("30th streeet")
		.enterArea("Anna Nagar")
		.selectCountry("94")
		.enterMobile("9898790987")
		.enterPincode("600040")
		.pressTab()
		.selectPostOff("Anna Nagar S.O (Chennai)")
		.clickComAddSameResAdd()
		.enterOffFlat("No 68")
		.enterOffStreet("11th street")
		.enterOffArea("Banaswadi")
		.selectOffCountry("94")
		.enterOffMobile("9865896233")
		.enterOffPin("560043")
		.pressTab()
		.selectOffPost("Banaswadi S.O");
		
	}

}

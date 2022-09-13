package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.irctc.pages.CovidAlertPage;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC004";
		testCaseDescription = "To verify IRCTC Hotel booking and validating the error msg for OTP";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://www.irctc.co.in/";
	}
	
	@Test
	public void bookHotels() {
		
		new CovidAlertPage(driver, test)
		.acceptCovidAlert()
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickLoungelink()
		.switchtoAccWindow()
		.clickSidebar()
		.clickHotels()
		.switchtoHotelWindow()
		.clickLogin()
		.clickGuesUserLogin()
		.enterEmail("abi@gmail.com")
		.enterMobileNo("8778582102")
		.clickGuestLogin()
		.enterAndSelectCity("Chennai")
		.clickChekInDate()
		.selectChekInDate()
		.clickChekOutDate()
		.selectChekOutDate()
		.clickGuest()
		.selectRoom("2")
		.selectAdult("3")
		.clickDone()
		.clickFindHotel()
		.switchtoHotelListWindow()
		.selectHotel()
		.switchtoHotelDetailsWindow()
		.getHotelName()
		.getHotelAmount()
		.clickContinueToBook()
		.selectTitle("Mrs")
		.enterFirstName("Abi")
		.enterLasttName("Mathi")
		.selectState("TN")
		.verifyHotelName()
		.verifyHotelAmount()
		.scrollDown()
		.clickContinue()
		.checkTermsCheckBox()
		.clickMakePayement()
		.clickVerify()
		.verifyOTPError("otp is required.");
		
	}
}

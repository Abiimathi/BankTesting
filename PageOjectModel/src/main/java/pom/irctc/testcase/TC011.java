package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.pan.pages.RegisterPage;

public class TC011 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC011";
		testCaseDescription = "To verify PAN Registration for applying new PAN card";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://panind.com/india/new_pan/";
	}
	
	@Test
	
	public void PanRegister() {
		
		new RegisterPage(driver, test)
		.selectTitle(2)
		.enterFirstName("Abi")
		.enterMiddleName("Mathi")
		.enterLastName("Ilango")
		.enterFatFirstName("Ilango")
		.enterFatMiddleName("Pandi")
		.enterFatLastName("Rajan")
		.enterMobile("984578965")
		.enterMail("abi@gmail.com")
		.selectIncome("2")
		.selectAddforComm(1)
		.enterDOBdob("18091994")
		.clickPageDown()
		.enterAdd1("315")
		.enterAdd2("29TH STREET")
		.enterCity("CHENNAI")
		.selectState("Tamil Nadu")
		.enterZip("6000040")
		.clickPageDown()
		.selectCountry(0)
		.selectIdProof("16")
		.selectAddProof("5")
		.selectDobProof("6")
		.selectAdhProof("Copy of Aadhaar Card/Letter")
		.clickPageDown()
		.getText()
		.clickAgree()
		.clickNextbtn()
		.switchToPayWindow()
		.getOrderId();
		
	}
}

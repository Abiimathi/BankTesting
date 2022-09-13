package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.ProjectImplementation.ProjectWrappers;
import pom.indianform.pages.Signup;

public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC006";
		testCaseDescription = "To verify user registration of Form C";
		author = "Abimathi";
		category = "SmokeTest";
		browserName = "chrome";
		url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
	
	@Test
	public void registerForm() {
		
		new Signup(driver,test)
		.clickSignup()
		.enterUserId("Abimathi18")
		.enterPwd("Abi@1809")
		.entercnfpwd("Abi@1809")
		.selectSecQue("5")
		.enterSecAns("Pandi")
		.enterUserName("Abimathi")
		.selectGender("F")
		.enterDOB("18/09/1994")
		.enterDesignation("Manager")
		.enterEmail("abi@gmail.com")
		.enterMobile("9923992344")
		.enterPhone("044 28501223")
		.enterNation("IND")
		.entergName("Hesh")
		.enterCapacity("10")
		.enterAddress("32, 3rd cross street, Porur")
		.selectState("TAMIL NADU")
		.selectDist(3)
		.selectAccType("GH")
		.selectGrade("3s")
		.enterGemail("abi@gmail.com")
		.enterGmobile("9875478546")
		.enterGphone("044 897564")
		.enterO1name("Mathi")
		.enterO1add("32, 4th main road, Vanagaram")
		.selectO1State("TAMIL NADU")
		.selectO1dis("4C")
		.entero1email("mathi@gamil.com")
		.entero1phone("044 896210")
		.entero1mobile("7744558866")
		.clickAddButton()
		.enterO2name("Ilango")
		.enterO2add("56, 34th street, Anna nagar")
		.selectO2State("KERALA")
		.selectO2dis("10D")
		.entero2email("ilango@gmail.com")
		.entero2phone("044 5689234")
		.entero2mobile("6655882211")
		.clickAddButton()
		.enterO3name("Bala")
		.enterO3add("89, 2nd mainroad, Gandhinagar")
		.selectO3State("GUJARAT")
		.selectO3dis("1D")
		.entero3email("bala@gmail.com")
		.entero3phone("044 568923")
		.entero3mobile("7778889966");
	}
}

package org.istreet.testcases;

import org.istreet.framework.TestCaseSetup;
import org.istreet.pageobjects.IStreetHomePage;
import org.istreet.pageobjects.IStreetSignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterUser extends TestCaseSetup{
	
	@Test
	public void registerUser() throws Exception
	{
		IStreetHomePage signUp = PageFactory.initElements(driver, IStreetHomePage.class);
		signUp.clickSignUpLink();
		IStreetSignUpPage register = PageFactory.initElements(driver, IStreetSignUpPage.class);
		register.fillOutFirstName("testing");
		register.fillOutLastName("name");
		register.fillOutEmail("emilio.valqui@gmail.com");
		register.fillOutPassword("testPassword");
		register.fillOutCompany("test company");
		register.fillOutNumber("(123) 123-1234");
		register.clickSignUpButton();

	}
}

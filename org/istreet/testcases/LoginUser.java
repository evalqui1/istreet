package org.istreet.testcases;

import org.istreet.framework.TestCaseSetup;
import org.istreet.pageobjects.IStreetHomePage;
import org.istreet.pageobjects.IStreetLoginPage;
import org.istreet.pageobjects.IStreetUserPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginUser extends TestCaseSetup{
	
	@Test
	public void loginUser() throws Exception
	{
		IStreetHomePage login = PageFactory.initElements(driver, IStreetHomePage.class);
		login.clickLoginLink();
		IStreetLoginPage signIn = PageFactory.initElements(driver, IStreetLoginPage.class);
		signIn.fillOutEmail("evtest230420554@emilio.ilovetvguide.com");
		signIn.fillOutPassword("testPassword");
		signIn.clickLoginButton();
		IStreetUserPage logout = PageFactory.initElements(driver, IStreetUserPage.class);
		logout.leaveTour();
		logout.clickDropDown();
		logout.clickLogoutButton();
	}
}
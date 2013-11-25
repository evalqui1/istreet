package org.istreet.testcases;

import org.istreet.framework.TestCaseSetup;
import org.istreet.pageobjects.IStreetHomePage;
import org.istreet.pageobjects.IStreetLoginPage;
import org.istreet.pageobjects.IStreetSettingsPage;
import org.istreet.pageobjects.IStreetUserPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChangeUserInformation extends  TestCaseSetup{
	
	@Test
	public void changeUserInformation() throws Exception
	{
	IStreetHomePage home = PageFactory.initElements(driver, IStreetHomePage.class);
	home.clickLoginLink();
	IStreetLoginPage login = PageFactory.initElements(driver, IStreetLoginPage.class);
	login.fillOutEmail("emilio.valqui@gmail.com");
	login.fillOutPassword("testPassword");
	login.clickLoginButton();
	IStreetUserPage user = PageFactory.initElements(driver, IStreetUserPage.class);
	user.leaveTour();
	user.clickDropDown();
	user.clickSettingsOption();
	IStreetSettingsPage settings = PageFactory.initElements(driver, IStreetSettingsPage.class);
	settings.verifySettingsHeader();
	settings.changeFirstName("testing");
	settings.changeLastName("user2");
	settings.changeCompanyName("anotherCompanyName");
	settings.changePhoneNumber("(012) 123-4567");
	settings.changeEmailFrom("A New User");
	settings.clickSaveChanges();
	settings.verifyChangesSaved();
	}
}

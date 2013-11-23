package org.istreet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IStreetHomePage { 

	final WebDriver driver;

	@FindBy(linkText="LOGIN")
	private WebElement loginLink;
	
	@FindBy(linkText="SIGN UP")
	private WebElement signUpLink;

	@FindBy(css="div.main-pitch")
	private WebElement mainPitch;

	public IStreetHomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickLoginLink()
	{
		loginLink.click();
	}

	public void clickSignUpLink()
	{
		signUpLink.click();
	}

	public void verifyMainPitch()
	{
		Assert.assertTrue(mainPitch.isDisplayed());
		Assert.assertTrue(mainPitch.getText().contains("The #1 technical recruiting platform."));
	}	
}
package org.istreet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IStreetUserPage {
	
	final WebDriver driver;
	
	@FindBy(id="createNewTest")
	private WebElement createTestButton;
	
	@FindBy(css="a.dropdown-toggle")
	private WebElement menuDropDown;
	
	@FindBy(id="link_settings")
	private WebElement settingsButton;
	
	@FindBy(css="div.new-users div.fade")
	private WebElement fadeDiv;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[3]/a")
	private WebElement logoutButton;
	
	public IStreetUserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void leaveTour()
	{
		fadeDiv.click();
	}
	
	public void verifyCreateTestButton()
	{
		Assert.assertTrue(createTestButton.isDisplayed());
	}
	
	public void clickDropDown()
	{
		menuDropDown.click();
	}
	
	public void clickSettingsOption()
	{
		settingsButton.click();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}

}

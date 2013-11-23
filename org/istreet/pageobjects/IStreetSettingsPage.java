package org.istreet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IStreetSettingsPage {
	
	final WebDriver driver;
	
	@FindBy(css="div.container_head")
	private WebElement settingsHeader;
	
	@FindBy(name="firstname")
	private WebElement firstNameField;
	
	@FindBy(name="lastname")
	private WebElement lastNameField;
	
	@FindBy(name="companyname")
	private WebElement comapnyNameField;
	
	@FindBy(name="phone")
	private WebElement phoneNumberField;
	
	@FindBy(name="company_email_from")
	private WebElement emailFromField;
	
	@FindBy(linkText="Save")
	private WebElement saveChangesButton;
	
	@FindBy(linkText="Saved")
	private WebElement savedChangesButton;
	
	@FindBy(css="a.dropdown-toggle")
	private WebElement menuDropDown;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[3]/a")
	private WebElement logoutButton;
	
	public IStreetSettingsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifySettingsHeader()
	{
		Assert.assertTrue(settingsHeader.isDisplayed());
	}
	
	public void changeFirstName(String newFirstName)
	{
		firstNameField.clear();
		firstNameField.sendKeys(newFirstName);
	}
	
	public void changeLastName(String newLastName)
	{
		lastNameField.clear();
		lastNameField.sendKeys(newLastName);
	}
	
	public void changeCompanyName(String newCompany)
	{
		comapnyNameField.clear();
		comapnyNameField.sendKeys(newCompany);
	}
	
	public void changePhoneNumber(String newNumber)
	{
		phoneNumberField.clear();
		phoneNumberField.sendKeys(newNumber);
	}
	
	public void changeEmailFrom(String emailFrom)
	{
		emailFromField.clear();
		emailFromField.sendKeys(emailFrom);
	}
	
	public void clickSaveChanges()
	{
		saveChangesButton.click();
	}
	
	public void verifyChangesSaved()
	{
		savedChangesButton.isDisplayed();
	}
	
	public void clickDropDown()
	{
		menuDropDown.click();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
}
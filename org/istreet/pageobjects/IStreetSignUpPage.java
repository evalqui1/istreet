package org.istreet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IStreetSignUpPage {
	
	final WebDriver driver;
	
	@FindBy(id="inputFirstName")
	private WebElement firstNameField;
	
	@FindBy(id="inputLastName")
	private WebElement lastNameField;
	
	@FindBy(id="inputEmail")
	private WebElement emailField;
	
	@FindBy(id="inputPassword")
	private WebElement passwordField;
	
	@FindBy(id="inputCompany")
	private WebElement companyField;
	
	@FindBy(id="inputNumber")
	private WebElement numberField;
	
	@FindBy(name="signup_button")
	private WebElement signUpButton;
	
	public IStreetSignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fillOutFirstName(String firstName)
	{
		firstNameField.clear();
		firstNameField.sendKeys(firstName);
	}

	public void fillOutLastName(String lastName)
	{
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}
	
	public void fillOutEmail(String userEmail)
	{
		emailField.clear();
		emailField.sendKeys(userEmail);
	}
	
	public void fillOutPassword(String password)
	{
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void fillOutCompany(String companyName)
	{
		companyField.clear();
		companyField.sendKeys(companyName);
	}
	
	public void fillOutNumber(String phoneNumber)
	{
		numberField.clear();
		numberField.sendKeys(phoneNumber);
	}
	
	public void clickSignUpButton()
	{
		signUpButton.click();
		signUpButton.click();
		signUpButton.click();
	}
}


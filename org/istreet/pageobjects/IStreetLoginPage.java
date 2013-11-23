package org.istreet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IStreetLoginPage {
	
	final WebDriver driver;
	
	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login_action")
	private WebElement loginButton;

	@FindBy(css="#login-msg.font-clr-white div.message p")
	private WebElement errorMessage;
	
	public IStreetLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fillOutEmail(String userEmail)
	{
		emailField.clear();
		emailField.sendKeys(userEmail);
	}
	
	public void fillOutPassword(String userPassword)
	{
		passwordField.clear();
		passwordField.sendKeys(userPassword);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void noEmailMessage()
	{
		Assert.assertTrue(errorMessage.isDisplayed());
		Assert.assertTrue(errorMessage.getText().contains("Please enter your registered e-mail address."));
	}
	
	public void noPasswordMessage()
	{
		Assert.assertTrue(errorMessage.isDisplayed());
		Assert.assertTrue(errorMessage.getText().contains("Please enter a password."));
	}
	
	public void invalidLoginMessage()
	{
		Assert.assertTrue(errorMessage.isDisplayed());
		Assert.assertTrue(errorMessage.getText().contains("Login Failed. Please check username/password."));
	}
}
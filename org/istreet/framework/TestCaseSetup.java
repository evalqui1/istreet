package org.istreet.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCaseSetup {

	public WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.interviewstreet.com/recruit2/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}

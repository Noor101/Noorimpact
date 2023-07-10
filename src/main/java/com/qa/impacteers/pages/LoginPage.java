package com.qa.impacteers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.qa.impacteers.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// Page Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// private By Locators
	private By emailId = By.id("email");
	private By password = By.id("password");

	//Page Actions
	public void navigateToLoginPage() {
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();

	}

}

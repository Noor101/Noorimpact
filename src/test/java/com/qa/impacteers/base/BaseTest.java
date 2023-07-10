package com.qa.impacteers.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.impacteers.factory.DriverFactory;
import com.qa.impacteers.pages.LoginPage;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;
	Properties prop;
	protected LoginPage loginPage;

	@BeforeTest
	public void setup() {

		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

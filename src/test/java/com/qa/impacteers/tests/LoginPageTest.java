package com.qa.impacteers.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.impacteers.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@BeforeClass
	public void loginPageSetup() {
		loginPage.navigateToLoginPage();
	}
	
	@Test
	public void loginPageTitleTest() {
		
		
}

}

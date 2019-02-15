package com.gmail.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilize();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		Assert.assertEquals(title, "Gmail");
	}

	@Test(priority = 2)
	public void signInTextTest() {
		Assert.assertTrue(loginpage.checksingInText());
	}
	
	@Ignore
	@Test(priority = 3)
	public void googleTextTest() {
		Assert.assertTrue(loginpage.checkgoogleText());
	}

	@Ignore
	@Test(priority = 4)
	public void createAccountLinkTest() {
		Assert.assertTrue(loginpage.checkcreateAccountLink());
	}

	@Ignore
	@Test(priority = 5)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}

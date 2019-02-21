package com.gmail.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;


import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilize();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test
	public void homePageTitleTest() {
		String title = homePage.homePageTitle();
		Assert.assertEquals(title.contains(prop.getProperty("email")), true);
	}

	@Test
	public void homePageGmailLogoTest() {
		Assert.assertTrue(homePage.gmailLogo());
	}

	@Test
	public void searchTextBoxTest() {
		Assert.assertTrue(homePage.searchTextBox());
	}
	
	@Ignore
	@Test
	public void composeEmailButtonTest() {
		Assert.assertTrue(homePage.newEmailButton());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

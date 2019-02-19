package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement nextBtn;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//content[contains(text(),'Sign in')]")
	WebElement signIntxt;

	@FindBy(xpath = "//div[@class='qZp31e']")
	WebElement googleLogotxt;

	@FindBy(xpath = "//span[contains(text(),'Create account')]")
	WebElement createAccountLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean checksingInText() {
		return signIntxt.isDisplayed();
	}

	public boolean checkgoogleText() {
		return googleLogotxt.isDisplayed();
	}

	public boolean checkcreateAccountLink() {
		return createAccountLink.isDisplayed();
	}

	public HomePage login(String id, String pwd) {
		email.sendKeys(id);
		nextBtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		password.sendKeys(pwd);
		nextBtn.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new HomePage();
	}
}

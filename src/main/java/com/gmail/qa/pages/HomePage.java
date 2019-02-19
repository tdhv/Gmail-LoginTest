package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[text()='Inbox']")
	WebElement inbox_link;

	@FindBy(xpath = "//a[text()='Sent']")
	WebElement sent_link;

	@FindBy(xpath = "//img[@class='gb_0a']")
	WebElement gmail_logo;

	@FindBy(xpath = "//input[@aria-label='Search mail']")
	WebElement searchBox;

	@FindBy(xpath = "//div[text()='Compose']")
	WebElement newEmail;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String homePageTitle() {
		return driver.getTitle();
	}

	public boolean gmailLogo() {
		return gmail_logo.isDisplayed();
	}

	public boolean searchTextBox() {
		return searchBox.isDisplayed();
	}

	public boolean newEmailButton() {
		return newEmail.isDisplayed();
	}

}

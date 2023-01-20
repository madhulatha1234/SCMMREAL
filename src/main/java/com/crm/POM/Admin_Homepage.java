package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Homepage {
	@FindBy(xpath = "//a[.='Manage Unit']")
	private WebElement manageunit;

	public WebElement getManageunit() {
		return manageunit;
	}
	public Admin_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void homepagee2() {
		manageunit.click();
	}
}

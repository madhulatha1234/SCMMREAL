package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.WebDriverUtility;

public class AdminloginPage extends WebDriverUtility{
	@FindBy (id="login:username")
	private WebElement username;

	@FindBy(id="login:password")
	private WebElement password;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(id="login:type")
	private WebElement dropdown;
 
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@value='Log out']")
	private WebElement logoutt;
	public WebElement getLogoutt() {
		return logoutt;
	}

	
	public AdminloginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void admin(String userName,String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
//		select("Admin", dropdown);
//		loginbutton.click();
	}
	public void adminDropdown() {
		select("Admin", dropdown);
		loginbutton.click();

	}
	public void loggout() {
		logoutt.click();
	}
	
}

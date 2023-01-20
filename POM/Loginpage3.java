package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.WebDriverUtility;

public class Loginpage3 extends WebDriverUtility{
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

	public Loginpage3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void admin(String userName,String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		select("Admin", dropdown);
		loginbutton.click();
	}
}



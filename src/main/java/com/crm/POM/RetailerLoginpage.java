package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.WebDriverUtility;

public class RetailerLoginpage extends WebDriverUtility{
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

	public RetailerLoginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void retailer(String userName) {
		username.sendKeys(userName);
		password.sendKeys("admin1234");
//		select("Retailer", dropdown);
//		loginbutton.click();
	}
	public void retailerDropdown() {
		select("Retailer", dropdown);
		loginbutton.click();

	}
}



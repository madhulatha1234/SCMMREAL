package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.WebDriverUtility;

public class LoginPage extends WebDriverUtility{
	
	@FindBy (id="login:username")
	private WebElement username;

	@FindBy(id="login:password")
	private WebElement password;
	
public WebElement getClick() {
		return click;
	}


@FindBy(xpath="//body[@class='login-box']")
private WebElement click;

	@FindBy(id="login:type")
	private WebElement dropdown;
 
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbutton;
	
	

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
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logintoapp(String userName,String PassWord) throws InterruptedException {
		username.sendKeys(userName);
		password.sendKeys(PassWord);
		//click.click();
		Thread.sleep(2000);
		select(dropdown, "manufacturer");
		
		
		loginbutton.click();
	}

}

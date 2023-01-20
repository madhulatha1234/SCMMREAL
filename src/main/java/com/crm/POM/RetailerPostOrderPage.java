package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.JavaUtility;

public class RetailerPostOrderPage{
	@FindBy(id = "retailer:phone")
	private WebElement phonetbx;
	
	@FindBy(id = "retailer:email")
	private WebElement emailtbx;
	
	@FindBy(id = "retailer:address")
	private WebElement addresstbx;
	
	@FindBy(xpath = "//input[@value='Change Password']")
	private WebElement changePwdBtn;
	
	@FindBy(xpath = "//input[@value='Update Profile']")
	private WebElement updateProfileBtn;
	
	@FindBy(id = "oldPassword")
	private WebElement oldPassTbx;
	
	@FindBy(id = "newPassword")
	private WebElement newPassTbx;
	
	@FindBy(id = "confirmPassword")
	private WebElement confPassTbx;
	
	
	
	public RetailerPostOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getPhonetbx() {
		return phonetbx;
	}



	public WebElement getEmailtbx() {
		return emailtbx;
	}



	public WebElement getAddresstbx() {
		return addresstbx;
	}



	public WebElement getChangePwdBtn() {
		return changePwdBtn;
	}



	public WebElement getUpdateProfileBtn() {
		return updateProfileBtn;
	}



	public WebElement getOldPassTbx() {
		return oldPassTbx;
	}



	public WebElement getNewPassTbx() {
		return newPassTbx;
	}



	public WebElement getConfPassTbx() {
		return confPassTbx;
	}

	public void clearPhoneTbx()
	{
		phonetbx.clear();
	}
	
	public void clearEmailTbx()
	{
		emailtbx.clear();
	}
	
	public void clearAddressTbx()
	{
		addresstbx.clear();
	}
JavaUtility ju=new JavaUtility();
	
	
	public void updateProfile() throws InterruptedException
	{
		int random = ju.getRandomNo();
		clearPhoneTbx();
		Thread.sleep(3000);
		clearEmailTbx();
		Thread.sleep(3000);
		clearAddressTbx();
		Thread.sleep(3000);
		
		 String ph = "8521712345";
		phonetbx.sendKeys(ph);
		emailtbx.sendKeys("Madhu@gmail.com");
		addresstbx.sendKeys("Mysore");
		updateProfileBtn.click();
	}
	
	
}

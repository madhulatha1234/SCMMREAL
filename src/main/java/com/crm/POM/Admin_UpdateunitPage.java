package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_UpdateunitPage {
@FindBy(xpath = "//input[@placeholder='Unit Name']")
private WebElement clearunitname;
@FindBy(xpath = "//textarea[@placeholder='Details']")
private WebElement cleardetails;
@FindBy(xpath = "//input[@value='Update Unit']")
private WebElement clickonupdateunit;
public WebElement getClearunitname() {
	return clearunitname;
}
public WebElement getCleardetails() {
	return cleardetails;
}
public WebElement getClickonupdateunit() {
	return clickonupdateunit;
}
public Admin_UpdateunitPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void updatedata() {
	clearunitname.clear();;
	cleardetails.clear();
}
public void againupdate(String unitname,String details) {
	clearunitname.sendKeys(unitname);
	cleardetails.sendKeys(details);
}
public void updateunit() {
	clickonupdateunit.click();
}
}

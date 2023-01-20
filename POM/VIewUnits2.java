package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VIewUnits2 {
@FindBy(xpath = "//input[@value='+ Add Unit']")
private WebElement clickAddunit;
@FindBy (xpath = "(//input[@type='checkbox'])[7]")
private WebElement clickoncheckbox;
@FindBy(xpath = "//input[@value='Delete']")
private WebElement clickondelete;
@FindBy(xpath = "(//img[@alt='edit'])[7]")
private WebElement clickonedit;
public WebElement getClickonedit() {
	return clickonedit;
}
public WebElement getClickoncheckbox() {
	return clickoncheckbox;
}
public WebElement getClickAddunit() {
	return clickAddunit;
}
public VIewUnits2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickaddunit() {
	clickAddunit.click();
}
public void clickOncheckboxAndDeleteButton() {
	clickoncheckbox.click();
	clickondelete.click();
	//clickonedit.click();
}
public void clickonedit() {
	clickonedit.click();
}
}

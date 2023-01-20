package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GeneticUtilities.ExcelUtility;

public class AdminAddUnitPage {

@FindBy (id="unitName")
private WebElement unitName;
@FindBy(id="unitDetails")
private WebElement unitDetails;
@FindBy(xpath = "//input[@value='Add Unit']")
private WebElement clickonadd;

public WebElement getClickonadd() {
	return clickonadd;
}
public WebElement getUnitName() {
	return unitName;
}
public WebElement getUnitDetails() {
	return unitDetails;
}
public AdminAddUnitPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public void aadunit(String unitname, String unitdetails ) throws InterruptedException {
	unitName.sendKeys(unitname);
	Thread.sleep(2000);
	unitDetails.sendKeys(unitdetails);
	
	clickonadd.click();
}


}

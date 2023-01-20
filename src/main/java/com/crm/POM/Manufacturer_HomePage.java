package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manufacturer_HomePage {
	
	//WebDriver driver=null;
@FindBy(linkText = "Add Products")
private WebElement addproduct;

public WebElement getAddproduct() {
	return addproduct;
	}

public Manufacturer_HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickonhome() {
	addproduct.click();
}
@FindBy(linkText = "Products")
private WebElement productclick;

public WebElement getProductclick() {
	return productclick;
}
public void productClick() {
	productclick.click();
}
}

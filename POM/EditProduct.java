package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProduct {
	@FindBy(id="product:name")
	private WebElement productname;
@FindBy(xpath = "//input[@value='Update Product']")
private WebElement updateproduct;
	public WebElement getUpdateproduct() {
	return updateproduct;
}
	public WebElement getProductname() {
		return productname;
	}
public EditProduct(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void editProduct() throws InterruptedException {
	productname.clear();
	Thread.sleep(2000);
	productname.sendKeys("veg biriyani");
}
public void updateproduct() {
	updateproduct.click();	
}
}

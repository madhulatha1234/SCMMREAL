package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;

public class logintest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ExcelUtility eu=new ExcelUtility();
		FileUtility fu=new FileUtility();
		WebDriverUtility wu=new WebDriverUtility();
		WebDriver driver=null;
		String url =fu.readdatafromPropertyFile("url");
		String un = fu.readdatafromPropertyFile("username");
	String pwd = fu.readdatafromPropertyFile("password");
	String bro = fu.readdatafromPropertyFile("browser");
	if(bro.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(bro.equals(bro)) {
		driver=new ChromeDriver();
	}
	
	driver.get(url);
	Thread.sleep(2000);
	LoginPage lp=new LoginPage(driver);
	lp.logintoapp(un, pwd);
	HomePage hp=new HomePage(driver);
	Thread.sleep(2000);
	hp.clickonhome();
	//ExcelUtility eu1=new ExcelUtility();
	//eu1.readMultipleData(driver, "Organization", 2, 3);
	AddProductPage add=new AddProductPage(driver);
	Thread.sleep(2000);
	add.addproducts();
	Thread.sleep(3000);
	wu.acceptAlert(driver);
	Thread.sleep(3000);
	hp.productClick();
	ViewProducts vp=new ViewProducts(driver);
	Thread.sleep(2000);
	vp.editbutton();
	EditProduct ep=new EditProduct(driver);
	Thread.sleep(2000);
	ep.editProduct();
	add.getEnable().click();
	Thread.sleep(2000);
	ep.updateproduct();
	Thread.sleep(2000);
	wu.acceptAlert(driver);
	Thread.sleep(2000);
	vp.checkbox();
	Thread.sleep(3000);
	wu.acceptAlert(driver);
	}

}

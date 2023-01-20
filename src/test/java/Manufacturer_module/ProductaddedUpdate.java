package Manufacturer_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.IPathConstant;
import com.crm.GeneticUtilities.WebDriverUtility;

public class ProductaddedUpdate implements IPathConstant{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileUtility fu=new FileUtility();
		ExcelUtility eu=new ExcelUtility();
		WebDriverUtility wu=new WebDriverUtility();
		String url = fu.readdatafromPropertyFile("url");
		String browser = fu.readdatafromPropertyFile("browser");
		String username = fu.readdatafromPropertyFile("username");
		String password = fu.readdatafromPropertyFile("password");
		String manufacturer = fu.readdatafromPropertyFile("Manufacturer");
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.id(UsernameByID)).sendKeys(username);
		driver.findElement(By.id(PasswordByID)).sendKeys(password);
		driver.findElement(By.xpath(MSGClickByXpath)).click();
		WebElement admin = driver.findElement(By.id(DDAddressBYID));
		wu.select(admin,manufacturer );
		driver.findElement(By.xpath(ClickOnLoginButtonByXpath)).click();
		driver.findElement(By.linkText("Add Products")).click();
		eu.readMultipleData(driver,"Organization",2,3);
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.id("product:unit"));
		Thread.sleep(2000);
		wu.select(" PCS ", drop1);
	}

}

package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;

public class VTIGER {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileUtility fu=new FileUtility();
		ExcelUtility eu=new ExcelUtility();
		WebDriverUtility wu=new WebDriverUtility();
		String urlv = fu.readdatafromPropertyFile("urlV");
		String browser = fu.readdatafromPropertyFile("browser");
		String usernamev = fu.readdatafromPropertyFile("usernameV");
		String passwordv = fu.readdatafromPropertyFile("passwordV");
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		driver.get(urlv);
driver.findElement(By.name("user_name")).sendKeys(usernamev);
driver.findElement(By.name("user_password")).sendKeys(passwordv);
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Products")).click();

String parent = driver.getWindowHandle();


driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
driver.findElement(By.id("jscal_trigger_sales_start_date")).click();
//Set<String> popup = driver.getWindowHandles();
//
//for(String value:popup) {
//System.out.println(value);
//}
WebElement element = driver.findElement(By.xpath("(//td[@class='button nav'])[1]"));
wu.mouseOver(driver, element);
element.click();
driver.findElement(By.xpath("//td[.='Thu']")).click();
driver.findElement(By.xpath("(//td[.='1'])[2]")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
Set<String> popup = driver.getWindowHandles();
for(String value:popup) {
	
	if(parent.equalsIgnoreCase(value)) {
		
	}
	else {
		driver.switchTo().window(value);
	}
System.out.println(value);
}
Thread.sleep(2000);

driver.findElement(By.xpath("((//tbody)[7]//tr/td)[3]//a")).click();
Thread.sleep(2000);
driver.switchTo().window(parent);
driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("colours");
//driver.switchTo().window(parent);
	}

}

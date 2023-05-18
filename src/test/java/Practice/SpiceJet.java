package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class SpiceJet {
	@Test
public void jet() throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	
	
//	WebElement ele = driver.findElement(By.xpath("//div[text()='From']"));
//	ele.click();
//	
//	driver.findElement(By.xpath("//div[text()='Agra']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input")).sendKeys("Delhi");
	//for(int i=0;i<=2;i++) {
		driver.findElement(By.xpath("//*[name()='circle']/ancestor::*[name()='g' and @transform='translate(1 1)']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-July-2023']/descendant::div[text()='16']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg' and @data-testid='svg-img' and @preserveAspectRatio='none'])[16]")).click();
		Actions act =new Actions(driver);
//		//act.moveByOffset(0,0);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n' and @style='margin-right: 6px;']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/descendant::*[name()='rect']")).click();
		act.moveByOffset(30, 40).click().perform();
		WebElement cont=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1enofrn r-1kfrs79']"));
		Actions acti=new Actions(driver);
		acti.moveToElement(cont).click().perform();
		Thread.sleep(3000);
		WebElement cont1 = driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']/div[text()='Continue']"));
		acti.moveToElement(cont1).click().perform();
		Thread.sleep(2000);
		//WebElement value=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-1ap4h1l']"));
Actions actt=new Actions(driver);
//actt.moveToElement(value);
		
		//		boolean ele2 = driver.findElement(By.className("css-1dbjc4n r-obd0qt r-1ap4h1l")).isEnabled();
		//driver.findElement(By.xpath("(//div[text()='Continue'])[2]")).click();
		Thread.sleep(2000);
		//actt.moveByOffset(30, 40).click().perform();
		WebElement elee = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1862ga2 r-1enofrn r-1kfrs79']"));
		
		Actions actt1=new Actions(driver);
		
		actt1.moveToElement(elee).click().perform();
		//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-1ap4h1l']"))).click();
//		elee.click();
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/descendant::div[text()='Continue']")).click();
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
	
//		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("madhu");
//		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("latha");
//		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("456789032");
//		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("madhu@gmail.com");
//		driver.findElement(By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("shreni");
//		driver.findElement(By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("r m");
		
	//}
		
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("rathinasurya");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("9444855939");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("rathinasuryas@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Bangalore");
		
	}
	@Test(dataProvider = "Data1")
	public void testData1(String firstName,String lastName,String phNo){
		//first and middle name
		driver.findElement(By.xpath("//div[text()='First and Middle Name*']/ancestor::div[@class='css-1dbjc4n']/descendant::input[contains(@data-testid,'first-traveller-info-input-box')]")).sendKeys(firstName);
		//Last name
		driver.findElement(By.xpath("//div[text()='Last Name*']/ancestor::div[@class='css-1dbjc4n r-mvpalk r-5360zw']/descendant::input[contains(@data-testid,'last-traveller-info-input-box')]")).sendKeys(lastName);
		//mobile
		driver.findElement(By.xpath("//div[text()='SC Member ID / Mobile Number']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-1hfyk0a']/descendant::input[contains(@data-testid,'sc-member-mobile-number-input-box')]")).sendKeys(phNo);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
	}
	@Test(dataProvider = "Data2")
	public void testData2(String firstName,String lastName,String phNo) throws InterruptedException{
		//first and middle name
		driver.findElement(By.xpath("//div[text()='First and Middle Name*']/ancestor::div[@class='css-1dbjc4n']/descendant::input[contains(@data-testid,'first-traveller-info-input-box')]")).sendKeys(firstName);
		//Last name
		driver.findElement(By.xpath("//div[text()='Last Name*']/ancestor::div[@class='css-1dbjc4n r-mvpalk r-5360zw']/descendant::input[contains(@data-testid,'last-traveller-info-input-box')]")).sendKeys(lastName);
		//mobile
		driver.findElement(By.xpath("//div[text()='SC Member ID / Mobile Number']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-1hfyk0a']/descendant::input[contains(@data-testid,'sc-member-mobile-number-input-box')]")).sendKeys(phNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']")).click();
		driver.close();
	}
	
	@DataProvider(name = "Data1")
	public Object[][] data1()
	{
	Object[][] arr1=new Object[1][3];
	arr1[0][0]="vignesh";
	arr1[0][1]="ks";
	arr1[0][2]="9994288860";
	return arr1;
	}
	@DataProvider(name = "Data2")
	public Object[][] data2()
	{
	Object[][] arr2=new Object[1][3];
	arr2[0][0]="gopi";
	arr2[0][1]="nath";
	arr2[0][2]="9876543210";
	return arr2;
		
		
}
}

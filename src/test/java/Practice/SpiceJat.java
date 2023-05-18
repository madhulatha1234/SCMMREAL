package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SpiceJat {
	
	
	WebDriver driver;
	@Test
	public void spicejet() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
	
		option.addArguments("-disable-notifications");
		driver=new  ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
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
			//Actions act =new Actions(driver);
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n' and @style='margin-right: 6px;']")).click();
			driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/descendant::*[name()='rect']")).click();
		//	Actions act =new Actions(driver);
		//act.moveByOffset(30, 40).click().perform();
		WebElement cont=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1enofrn r-1kfrs79'/..]"));
	driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1enofrn r-1kfrs79'/..]")).click();
		Actions acti=new Actions(driver);
		acti.moveToElement(cont).click().perform();
		Thread.sleep(3000);
		WebElement cont1 = driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']/div[text()='Continue']"));
		acti.moveToElement(cont1).click().perform();
		
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("madhu");
	driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("latha");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("456789032");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("madhu@gmail.com");
	}
	@Test(dataProvider = "Data")
	public void value(String FN,String LN,String PN) throws InterruptedException{
		driver.findElement(By.xpath("//div[text()='First and Middle Name*']/ancestor::div[@class='css-1dbjc4n']/descendant::input[contains(@data-testid,'first-traveller-info-input-box')]")).sendKeys(FN);
		driver.findElement(By.xpath("//div[text()='Last Name*']/ancestor::div[@class='css-1dbjc4n r-mvpalk r-5360zw']/descendant::input[contains(@data-testid,'last-traveller-info-input-box')]")).sendKeys(LN);
		driver.findElement(By.xpath("//div[text()='SC Member ID / Mobile Number']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-1hfyk0a']/descendant::input[contains(@data-testid,'sc-member-mobile-number-input-box')]")).sendKeys(PN);
		driver.findElement(By.xpath("//div[text()='Next']")).click();

	}
		@DataProvider(name = "Data")
		public Object[][] data1()
		{
		Object[][] arr=new Object[2][3];
		arr[0][0]="shreni";
		arr[0][1]="rm";
		arr[0][2]="123456789";
		
		arr[1][0]="lavs";
		arr[1][1]="rm";
		arr[1][2]="987654321";

		return arr;
		}
		}

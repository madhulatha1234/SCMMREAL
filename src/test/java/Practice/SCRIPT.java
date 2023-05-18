package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SCRIPT {
@Test
public void testtt() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	if(login.isEnabled()) {
		System.out.println("is enabled");
		login.click();
	}
	else {
		System.out.println("is not enabled");
	}
}
}

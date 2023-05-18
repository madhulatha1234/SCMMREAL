package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String id:windows) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		
	}

}

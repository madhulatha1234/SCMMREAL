package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class BAfterscriptverifycreatedproject {

	public static void main(String[] args) throws InterruptedException, SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement state=null;
		//System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
driver.get("http://rmgtestingserver:8084/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
driver.findElement(By.xpath("//button[.='Sign in']")).click();
driver.findElement(By.xpath("//a[.='Projects']")).click();
driver.findElement(By.xpath("//span[.='Create Project']")).click();
driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("SCCM");
//driver.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("4");
driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Pradeep sir");
WebElement add = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
add.click();
Thread.sleep(2000);
Select sel=new Select(add);
sel.selectByValue("On Going");
driver.findElement(By.xpath("//input[@value='Add Project']")).click();
Thread.sleep(2000);
Driver driver1=new Driver();
DriverManager.registerDriver(driver1);
 con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
 state = con.createStatement();
 String query="select * from project";
 ResultSet result = state.executeQuery(query);
 System.out.println(result);
 while(result.next()) {
	 String u = result.getString(4);
	 System.out.println(u);
 }
 //System.out.println(u);
	}

}

package com.crm.GeneticUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.parser.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void elementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void select(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void select(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void select(String visibleText,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	public void mouseOver(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst);
	}
	public void doubleClickAction(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		
	}
	public void enterKeypress(WebDriver driver) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void enterpress(WebDriver driver) throws AWTException {
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	public void enterRelese(WebDriver driver) throws AWTException {
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}

	public void switchToFrame(WebDriver driver,WebElement adderss) {
		driver.switchTo().frame(adderss);

	}
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchToWindow(WebDriver driver,String partialTitle) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String winId = it.next();
			String currentwintitle = driver.switchTo().window(winId).getTitle();
			if(currentwintitle.contains(partialTitle)){
				break;	
			}
		}
	}

	public static String getScreenShoot(WebDriver driver,String screenShotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\screenshot\\"+screenShotName+".png";
		File dst=new File(path);
		FileUtils.copyFile(src, dst);
		return path;
	}
	public void scrollBarAction(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)","");
	}

	public void scrollAction(WebDriver driver, WebElement element,int yy) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")", element);
		
	}
}












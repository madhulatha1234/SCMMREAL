package com.crm.GeneticUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernewImplementationclass implements ITestListener {
ExtentReports report;
ExtentTest test;
	public void onTestStart(ITestResult result) {
		//Execution start from here
		String methodname = result.getMethod().getMethodName();
		 test = report.createTest(methodname);
		Reporter.log(methodname+"------> Testscript execution started");
		
			}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
test.log(Status.PASS, methodname+"---->passed");
Reporter.log(methodname+"------> Testscript execution successfully");
					}

	public void onTestFailure(ITestResult result) {
		String failedscript = result.getMethod().getMethodName();
		String FS=failedscript+new JavaUtility().getSystemDateAndTimeInFormat();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/"+FS+".png");
		String filepath = path.getAbsolutePath();
		
try {
	FileUtils.copyFile(src, path);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
test.addScreenCaptureFromPath(filepath);
test.log(Status.FAIL,result.getThrowable());
Reporter.log("test script execution failed");
			}

	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"---->skipped");
		Reporter.log(methodname+"------> Testscript execution skipped");
		}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
			}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtendReport/report.html");
		htmlreport.config().setDocumentTitle("SDET-45 Extend Report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("SCM report");
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base Browser","chrome");
		report.setSystemInfo("OS", "windows");
		report.setSystemInfo("Base-URL","https://localhost:8888");
		report.setSystemInfo("Reporter name", "Madhu Rangasamudra");
		
		
		
			}

	public void onFinish(ITestContext context) {
		report.flush();
			}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}

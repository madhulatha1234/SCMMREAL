package com.crm.GeneticUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImpleClass implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
//int counter=0;
//int retryLimit=4;
//	public boolean retry(ITestResult result) {
//	if(counter<retryLimit) {
//		counter++;
//		return true;
//	}
//		return false;
//	}

}

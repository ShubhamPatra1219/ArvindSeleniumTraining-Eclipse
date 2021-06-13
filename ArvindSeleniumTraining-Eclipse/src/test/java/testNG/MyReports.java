package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyReports implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("On Test Start " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("On Test Success " + result.getName());
	}

	public void onTestFaliure(ITestResult result) {
		Reporter.log("On Test Faliure " + result.getName());
		System.out.println("TAKE SCREENSHOT");
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("On Test Skipped " + result.getName());
	}

	public void onStart(ITestResult result) {	
		Reporter.log("On Test Start " + result.getName());
	}
	
	public void onFinish(ITestResult result) {	
		Reporter.log("On Test Finish " + result.getName());
	}
}

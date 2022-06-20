package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()  + "test is started");
	}
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.image(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result) {
		try {
			Screenshot.image(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()  + "test is skipped");
	}

}

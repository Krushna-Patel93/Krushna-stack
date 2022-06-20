package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.ZerodhaLogin;
import Utility.Parameterization;
import Utility.Report;

@Listeners(TestListeners.class)

public class ZerodhaLoginTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		reports = Report.createReport();}
	
	@BeforeMethod
	public void browser() {
		driver = Browser.chrome();
	}
	@Test                        
	public void loginwithcredentialTest() throws InterruptedException, EncryptedDocumentException, IOException{
		test = reports.createTest("loginwithcredentialTest");
		ZerodhaLogin obj = new ZerodhaLogin(driver);
		String username= Parameterization.getdata(0, 1);
		String pass= Parameterization.getdata(1, 1);
		obj.inputusername(username);
		obj.inputpassword(pass);
		obj.login();
		
	}
	@Test
        public void loginwithoutcredentialTest() throws EncryptedDocumentException, IOException{
		test = reports.createTest("loginwithoutcredentialTest");
		ZerodhaLogin obj = new ZerodhaLogin(driver);
		obj.login();
		obj.verify();
		
	}
	
	@Test
	public void forgotpasswordZerodhaLoginTest() {
		test = reports.createTest("forgotpasswordZerodhaLoginTest");
		ZerodhaLogin obj = new ZerodhaLogin(driver);
		obj.forgotpassword();
	}

	@Test
	public void signup() {
		test = reports.createTest("signup");
		ZerodhaLogin obj = new ZerodhaLogin(driver);
		obj.signup();
		
	}
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		
	
		if(result.getStatus() == ITestResult.FAILURE){
		test.log(Status.FAIL, result.getName());
	}else if(result.getStatus() == ITestResult.SUCCESS) {
		test.log(Status.PASS, result.getName());
	}
	else {
		test.log(Status.SKIP,result.getName());}
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
	
	}}
	

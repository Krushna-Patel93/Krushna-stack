package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import POJO.Browser;
import POM.BuyWindow;
import POM.HomePage;
import POM.ZerodhaLogin;
import POM.Zerodhapin;
import Utility.Parameterization;
import Utility.Report;
import Utility.Screenshot;

@Listeners(TestListeners.class)
public class HomePageTest extends BaseTest {
	
	
	@BeforeMethod
	public void browser() {
		driver = Browser.chromewithwait();
	}
	@Test                        
	public void loginwithcredentialTest() throws InterruptedException, EncryptedDocumentException, IOException{
		
		ZerodhaLogin obj = new ZerodhaLogin(driver);
		String username= Parameterization.getdata(0, 1);
		String pass= Parameterization.getdata(1, 1);
		obj.inputusername(username);
		obj.inputpassword(pass);
		obj.login();
		Thread.sleep(2000);
		Zerodhapin zerodhapin = new Zerodhapin(driver);
		String PIN= Parameterization.getdata(2, 1);
		zerodhapin.sendpin(PIN, driver);
		zerodhapin.submitpin();
		Thread.sleep(2000);
			HomePage homepage= new HomePage(driver);
			//String sharename= Parameterization.getdata(4, 1);
			//System.out.println(sharename);
			homepage.searchshare("icici");
//		    homepage.shareslist(driver);
			Thread.sleep(2000);
			homepage.buyshare(driver);
			BuyWindow buywindow= new BuyWindow(driver);
			///buywindow.selectchangewindow();//change window from buy to Sell
			buywindow.selectbse();
			
			
		    buywindow.selectmis();
		    buywindow.clearqty();
		    String QTY= Parameterization.getdata(5, 1);
		  	System.out.println(QTY);
		    buywindow.selectqty(QTY);
		    buywindow.selectmarketorder();
		    buywindow.selectbuy();

		    
		    
		    
		    
		
		homepage.selectorder();// select order
			//homepage.shareslist();
			
			Screenshot.image(driver,"lala.png");
	    	homepage.clickonlogout();//logout operation
	}

}



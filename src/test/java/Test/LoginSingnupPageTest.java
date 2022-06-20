package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLogin;
import POM.ZerodhaSingnup;
import Utility.Parameterization;



public class LoginSingnupPageTest {

WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser.chrome();
	}
	@Test
      public void createaccount() throws InterruptedException, EncryptedDocumentException, IOException {
    	  ZerodhaLogin zerodhaLogin = new ZerodhaLogin(driver);
    	  zerodhaLogin.signup();
    	  Set<String> adress = driver.getWindowHandles();
    		Iterator<String> i = adress.iterator();
    		Thread.sleep(2000);
    		while(i.hasNext()) {
    			String address = i.next();
    			driver.switchTo().window(address);
    			
    			
    			String currentTitle = driver.getTitle();
    			System.out.println(currentTitle);
    			Thread.sleep(2000);
    			if(currentTitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha")) {
    				Thread.sleep(2000);
    				ZerodhaSingnup zerodhaSingnup = new ZerodhaSingnup(driver);
    				String mobile=Parameterization.getdata(3, 1);
    				zerodhaSingnup.entermobilenumber(mobile);
    			}
    	  
    	 
      }
	
	}
}

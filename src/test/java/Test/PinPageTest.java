package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLogin;
import POM.Zerodhapin;
import Utility.Parameterization;

@Listeners(TestListeners.class)
public class PinPageTest extends BaseTest {

	
	@BeforeMethod
	public void browser() {
		driver = Browser.chrome();
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
		Thread.sleep(2000);
		zerodhapin.sendpin(PIN,driver);
		zerodhapin.submitpin();
		obj.positionverify1(driver);
	}

}

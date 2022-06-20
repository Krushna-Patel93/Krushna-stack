package PracticeTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLogin;
import POM.ZerodhaSingnup;
import POM.Zerodhapin;
import POMPractice.Coin;
import POMPractice.Holdingfeature;
import Utility.Parameterization;
import Utility.Screenshot;

public class Holding {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver = Browser.chrome();
	}
	@Test
	public void selectholding() throws InterruptedException, EncryptedDocumentException, IOException {
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
		Holdingfeature holdingfeature = new Holdingfeature(driver);
		holdingfeature.selectholdingoption();
		holdingfeature.selectdropdownoption();
		holdingfeature.selectcoin();
		Set<String> adress = driver.getWindowHandles();
		Iterator<String> i = adress.iterator();
		Thread.sleep(2000);
		while(i.hasNext()) {
			String address = i.next();
			driver.switchTo().window(address);
			
			
			String currentTitle = driver.getTitle();
			System.out.println(currentTitle);
			Thread.sleep(2000);
			if(currentTitle.equals("Summary - Coin by Zerodha")) {
				Thread.sleep(4000);
				Coin coin = new Coin(driver);
				coin.serchinput(driver);
				coin.inputshare("tata");
				Screenshot.image(driver, "coin.png");
				coin.selecttata(driver);
				coin.verifyinsight();
	}
		}
}}

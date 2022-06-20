package POMPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.ZerodhaLogin;
import POM.Zerodhapin;
import Utility.Parameterization;

public class TitleMethod {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\sellenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://coin.zerodha.com/dashboard");
		driver.manage().window().maximize();
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
			
	    //WebElement pages = driver.findElement(By.xpath(null));
	    String name= driver.getTitle();
	    System.out.println(name);
	}

}

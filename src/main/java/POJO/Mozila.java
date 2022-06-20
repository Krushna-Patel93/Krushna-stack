package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozila {
	public static WebDriver mozila() {
		System.setProperty("webdriver.gecko.driver","C:\\sellenium\\Mozila\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		
		return driver;
		
	}
	
	public static WebDriver mozilawithwait() {
		System.setProperty("webdriver.gecko.driver","C:\\sellenium\\Mozila\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		return driver;
		
	}
	}



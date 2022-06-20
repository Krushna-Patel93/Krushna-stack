package POJO;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\sellenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();//class of Selenium to control browser notification
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}
	public static WebDriver chromewithwait() {
		System.setProperty("webdriver.chrome.driver","C:\\sellenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}
	

	}



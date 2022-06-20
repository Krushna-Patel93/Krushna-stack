package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sellenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small grid-row-1']/child::div/child::a/child::div)[2]")).click();
		
		
		
	
	
	}
	
	
}
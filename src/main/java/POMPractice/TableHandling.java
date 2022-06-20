package POMPractice;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TableHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sellenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();//class of Selenium to control browser notification
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement Table = driver.findElement(By.xpath("//body//table//tr[10]//td[3]"));
		String a = Table.getText();
		System.out.println(a);
		
		WebElement current = driver.findElement(By.xpath("//body//table//tr[7]"));
		String b = current.getText();
		System.out.println("hello  "+ b);
		
		
		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int size = currentprice.size();
		double  d = Double.MIN_VALUE;
		double  c = Double.MAX_VALUE;
		for(int i=0; i<size; i++)
		{
			WebElement price = currentprice.get(i);
			String value = price.getText();
			System.out.println(value);
			double max = Double.parseDouble(value);
			if(d<=max)//intially -infinity & max value is 10
			{
				d = max;
			}
			if(c>=max)//intially infinity & max is 1000
			{
				c = max;
			}
			
		}
		System.out.println("Maximum value"+"- "+d);
		System.out.println("Minimum value"+"- "+c);

//		for(int i=0; i<c;i++) {
//			WebElement lala = price.get(i);
//			String menu = lala.getText();
//			double values = Double.parseDouble(menu);
//			System.out.print(values);
//			
//		}
//		
	}}
	



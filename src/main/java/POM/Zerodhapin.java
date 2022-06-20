package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Zerodhapin {
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement clickoncontineu;
	
	public Zerodhapin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//	public void sendpin(String pins,WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(20));//explicit wait
//		wait.until(ExpectedConditions.visibilityOf(pin));//will rechecks the element in 500ms
//		pin.sendKeys(pins);
//	}
	public void submitpin() {
		clickoncontineu.click();
	}
	public void sendpin(String pins,WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(30));
		wait.pollingEvery(Duration.ofMillis(10));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pins);
}
}
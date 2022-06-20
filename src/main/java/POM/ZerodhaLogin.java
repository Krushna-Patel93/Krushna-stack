package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ZerodhaLogin {
	
	@FindBy(xpath="//input[@autocapitalize='characters']")private WebElement username;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@class=\"button-orange wide\"]")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotpass;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy(xpath="//img[contains(@alt,\"Kite Android\")]")private WebElement playstore;
	@FindBy(xpath="//img[contains(@alt,\"Kite iOS\")]")private WebElement applestore;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement notify;
	@FindBy(xpath="//a[@href='/positions']")private WebElement position;
	
	public ZerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void inputusername(String email) {
		username.sendKeys(email);
	}
	public void inputpassword(String pass) {
		password.sendKeys(pass);
	}
	public void login() {
		login.click();
	}
	public void forgotpassword() {
		forgotpass.click();
	}
	public void signup() {
		signup.click();
	}
	public void playstoredownload() {
		playstore.click();
	}
	public void appledowload() {
		applestore.click();
	}
	public void verify() {
		boolean b = notify.isDisplayed();
		Assert.assertFalse(b);}
	
		public void positionverify1(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.visibilityOf(position));
			boolean c = position.isDisplayed();
			Assert.assertTrue(c);
			System.out.println("logis page is opend");	
		}
	}


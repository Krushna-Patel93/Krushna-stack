package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSingnup {
	
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobilenumber;
	@FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement contineu;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']")private WebElement nriaccount;
	@FindBy(xpath="//i[@class=\"icon-twitter\"]")private WebElement twitter;
	@FindBy(xpath="//i[@class='icon-facebook-official']")private WebElement facebook;
	@FindBy(xpath="(//a[text()='Products'])[3]")private WebElement products;
	@FindBy(xpath="//div[@id=\"menu_btn\"]")private WebElement menu;
	@FindBy(xpath="//a[@href='https://coin.zerodha.com']") private WebElement coin;
	@FindBy(xpath="//a[text()='Pricing']")private WebElement pricing;

	public ZerodhaSingnup(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void entermobilenumber(String mob) {
		
		
		mobilenumber.sendKeys(mob);
	}
	public void enternonriaccount() {
		nriaccount.click();
	}
	public void enternontwitter() {
		twitter.click();
	}
	public void enteronfacebook() {
		facebook.click();
	}
	public void openmenu() {
		menu.click();
	}
	public void opencoin() {
		coin.click();
	}
	public void pricing() {
		pricing.click();
	}
	
	
}

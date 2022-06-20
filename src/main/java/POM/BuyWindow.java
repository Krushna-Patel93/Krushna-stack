package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyWindow {
	@FindBy(xpath="//div[@class='su-radio-group']/child::div/child::label")private WebElement bse;
	@FindBy(xpath="//div[@class='su-radio-group']/child::div/child::label")private WebElement nse;
	@FindBy(xpath="//label[@for=\"radio-183\"]")private WebElement regular;
	@FindBy(xpath="//div[@class='product row']/child::div/child::div/child::label")private WebElement mis;
	@FindBy(xpath="//label[@for=\"radio-204\"]")private WebElement cnc;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement qty;
	@FindBy(xpath="//div[@class='su-radio-group order-type']/child::div")private WebElement market;
	@FindBy(xpath="//label[@for='radio-210']")private WebElement limit;
	@FindBy(xpath="//button[@class=\"submit\"]")private WebElement buy;
	@FindBy(xpath="(//button[@type=\"button\"])[3]")private WebElement cancel;
	@FindBy(xpath="//label[@class='su-switch-control']")private WebElement changewindow;
	
	public BuyWindow(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void selectbse() {
		bse.click();
	}
	public void selectnse() {
		nse.click();
	}
	public void selectregular() {
		regular.click();
	}
	public void selectmis() {
		mis.click();
	}
	public void selectcnc() {
		cnc.click();
	}
	public void clearqty() {
		qty.clear();
	}
	public void selectqty(String num) {
		qty.sendKeys(num);
	}
	public void selectmarketorder() {
		market.click();
	}
	public void selectlimit() {
		limit.click();
	}
	public void selectbuy() {
		buy.click();
	}
	public void selectcancel() {
		cancel.click();
	}
	public void selectchangewindow() {
		changewindow.click();
	}
	
}

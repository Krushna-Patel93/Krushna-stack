package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	
	@FindBy(xpath="(//span[@class=\"tradingsymbol\"])[1]")private WebElement Tata;
	@FindBy(xpath ="(//button[@type=\"button\"])[1]")private WebElement Bye;
	 @FindBy(xpath="//a[@href='/orders']")private WebElement order;
	 @FindBy(xpath="//a[@href='/positions']")private WebElement position;
	 @FindBy(xpath="//a[@href='/holdings']")private WebElement holding;
	 @FindBy(xpath="//span[@class=\\\"tradingsymbol\\\"])[1]")private WebElement buytatamotors;	
	 @FindBy(xpath="//div[@draggable='true']")private List<WebElement> shares;
	 @FindBy(xpath="//a//span[@class='user-id']")private WebElement account;
	 @FindBy(xpath="//a[@href='/logout']")private WebElement logout;
	 @FindBy(xpath="//a//span[text()='TATAMOTORS']")private WebElement tataa;
	 @FindBy(xpath="//button[@class='button-blue buy']/parent::span/child::button")private WebElement Byee;
	 @FindBy(xpath="(//button[@class='button-outline'])[3]")private WebElement deletetata;
	 public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver,this);}
	 
	 public void searchshare(String share) {
		 search.sendKeys(share);
	 }
	 public void buyshare(WebDriver driver) throws InterruptedException {
	
		Actions action = new Actions(driver);
		action.moveToElement(Tata).perform();
		action.moveToElement(Bye);
		action.click();
		action.perform();
		 
		
	 }
	 public void selectorder() {
		 order.click();
	 }
	 public void selectposition() {
		 position.click();
	 }
	 public void selectholding() {
		 holding.click();
	 }
	 public void shareslist(WebDriver driver) throws InterruptedException {
		 int a =shares.size();
		 for(int i=0; i<a; i++) {
			 WebElement serch = shares.get(i);
			 System.out.println(serch.getText());
			 String lala = serch.getText();
			 if(lala.equalsIgnoreCase("TATAMOTORS")) {
				 Actions action = new Actions(driver);
					action.moveToElement(tataa).perform();
					Thread.sleep(2000);
					action.moveToElement(Byee);
					action.click();
					action.perform();
					System.out.println("tata share selected");
					}
			 else {System.out.println("not found");}
		 }
		 }
		
	 public void clickonlogout() {
		 account.click();
		 logout.click();
	 }
	 public void delettatamotors() {
		 deletetata.click();
	 }
	
	 }
	 




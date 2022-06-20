package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Coin {
	@FindBy(xpath="//input[@class='search-input']")private WebElement input;
	@FindBy(xpath="(//span[@class='highlighter']/parent::span/child::span[1])[1]")private WebElement tataliqide;
	@FindBy(xpath="//span[text()='Compare']")private WebElement insigt;
	
	public Coin(WebDriver driver) {
		 PageFactory.initElements(driver,this);}
	
	public void serchinput(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(input).perform();
		action.click();
		action.perform();
   		
}
	public void inputshare(String share) {
		input.sendKeys(share);	
	}
	
	public void selecttata(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(tataliqide).perform();
		action.click();
		action.perform();
	}
	public void verifyinsight() {
		boolean d = insigt.isDisplayed();
		Assert.assertTrue(d);
	}
}
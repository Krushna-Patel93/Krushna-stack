package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Holdingfeature {
	 @FindBy(xpath="//a[@href='/holdings']")private WebElement holding;
	 @FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div/div/section/header/span/div/select")private WebElement holdings;
	 @FindBy(xpath="//a[@class='button button-blue']")private WebElement coin;
	 @FindBy(xpath="//span[text()='Insights']")private WebElement in;
	 @FindBy(xpath="//input[@id='password']")private WebElement password;
	 @FindBy(xpath="//input[@class='search-input']")private WebElement input;
	
	 
       public Holdingfeature(WebDriver driver) {
	 PageFactory.initElements(driver,this);}

       public void selectholdingoption() {
    	   holding.click();
       }
       public void selectdropdownoption() {
       	Select select = new Select(holdings);
       	select.selectByValue("mutualfunds");
}
       	public void selectcoin() {
       		coin.click();
       	}
       	public void selectin() {
       		in.click();
       	}
       	public void serchinput(String inputkey) {
       		input.sendKeys(inputkey);
       	}
       	
}
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotUserID {
	@FindBy(xpath="//label[@for='radio-57']")private WebElement rememberuserid;
	@FindBy(xpath="//label[@for=\"radio-58\"]")private WebElement forgotuserid;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan; 
	@FindBy(xpath="//label[@for='radio-62']")private WebElement emailreceive;
	@FindBy(xpath="//input[@placeholder=\"E-mail (as on account)\"]")private WebElement email;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement submit; 
	
	public ForgotUserID(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void selectuserid() {
		rememberuserid.click();
	}
	public void selectforgotuserid() {
		forgotuserid.click();
	}
	public void inputuserid(String newuserid) {
		userid.sendKeys(newuserid);
	}
	public void sendpan(String pannum) {
		pan.sendKeys(pannum);
	}
	public void selectmail() {
		emailreceive.click();
	}
	public void enteremail(String newmail) {
		email.sendKeys(newmail);
	}
	public void selectsubmit() {
		submit.click();
	}
	
	
	
	
}

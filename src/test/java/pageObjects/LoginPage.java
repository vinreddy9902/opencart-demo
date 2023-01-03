package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	// TO identify elements in login page 
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemailaddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement btnlogin;
	
	// Define action methods here
	
	public void setEmail(String email)
	{
		txtemailaddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickLoginbtn()
	{
		btnlogin.click();
	}
	

}

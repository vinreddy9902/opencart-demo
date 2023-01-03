package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")  // To capture heading element
	WebElement msgheading;  
	
	@FindBy(xpath="//body/main[1]/div[2]/div[1]/aside[1]/div[1]/a[13]")  // TO capture logout link.
	WebElement lnklogout;
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgheading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void clickLogout()
	{
		lnklogout.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
	
	

}

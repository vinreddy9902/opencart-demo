package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		
		super(driver);
	}
	
	// To identify Elements
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[contains(text(),'Login')]") // This element is added in step 6
	WebElement linklogin;
	
	
	// To Write Action methods
	
	public void clickMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linklogin.click();
	}
	
	
}

package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='content']/div[3]//img")
	List<WebElement> searchProducts;
			
	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement txtquantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement btnaddToCart;
	
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
	WebElement cnfMsg;
	
	public boolean isProductExist(String productName)
	{
		boolean flag=false;
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
			flag=true;
			break;
			}
		}
		
		return flag;
	
	}
	
	public void selectProduct(String productName)  
	{
		// This method will select product dynamically
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
				product.click();
			}
		}
	
	}
	
	public void setQuantity(String qty)
	{
		// This method will clear quantity box
		txtquantity.clear();
		txtquantity.sendKeys(qty);
	}
	
	public void addToCart()
	{
		btnaddToCart.click();  // Clicks on add to cart button.
	}
	
	
	public boolean checkConfMsg()
	{
		try
		{
		return cnfMsg.isDisplayed();  // This method will check confirmation message displayed or not
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
}

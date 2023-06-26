package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchProductTest extends BaseClass {
	
	@Test
	public void test_productSearch() throws InterruptedException
	{
		
		logger.info("*** Starting TC_004_SearchProductTest ***");
		
		try {
		HomePage hm= new HomePage(driver);
		
		hm.enterProductName("Mac");
		hm.clickSearch();
		
		SearchPage sp= new SearchPage(driver);
		sp.isProductExist("MacBook");
		
		Assert.assertEquals(sp.isProductExist("MacBook"),true); // Validation for the product.
		}
		catch(Exception e)
		{
			Assert.fail(); // If the selected product is not equal to the existed product.
		}
		
		
		logger.info("*** Finished TC_004_SearcgProductTest ***");
		
	}
	

}

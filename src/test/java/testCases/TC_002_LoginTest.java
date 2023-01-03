package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		
		try {
			
		logger.info(" *** Starting TC_002_LoginTest *** ");	
		
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		
		lp.setEmail(rb.getString("email")); // valid email, get it from properties file
		logger.info(" Provided Valid email...");
		
		lp.setPassword(rb.getString("password")); // valid password, get it from properties file
		logger.info(" Provided Valid Password...");
		
		lp.clickLoginbtn();
		logger.info(" Clicked on Login button...");
		
		MyAccountPage macc= new MyAccountPage(driver);
		
		boolean targetpage=macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true);
		
		
		
		}
		catch(Exception e)
		
		{
			
			Assert.fail();
			
		}
		
		logger.info(" Finished TC_002_LoginTest");
			
		
	}

}

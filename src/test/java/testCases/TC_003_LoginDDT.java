package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT( String email, String password, String exp)
	{
		
		try {
		logger.info(" *** Starting TC_003_LoginDDT *** ");
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		
        LoginPage lp= new LoginPage(driver);
		
        logger.info("Providing Login Credentials...");
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLoginbtn();
		
		
        MyAccountPage macc= new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();  // This method is created at my account page
		
		if (exp.equals("Valid")) // This is validations for positive and negative type of data.
		{  
			
			if (targetpage == true) {
				macc.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		
		if (exp.equals("Invalid")) {
			if (targetpage == true) {
				macc.clickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info(" ***Finished TC_003_LoginDDT*** ");
		
		
		
	}

}

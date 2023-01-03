package testCases;




import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;



public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"Regression","Master"})
	 public void test_account_registration()
	{
	    logger.info("*** Starting TC_001_AccountRegistrationTest  ***");
	    
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on my account...");
		
		hp.clickRegister();
		logger.info("Clicked on Register link...");
		
		AccountRegistrationPage repage= new AccountRegistrationPage(driver);
		repage.setFirstname(randomString().toUpperCase()); // Randomly generated first name 
		logger.info("Provided first name...");
		
		repage.setLastname(randomString().toUpperCase()); // randomly generated last name
		logger.info("Provided last name...");
		
		repage.setEmail(randomString()+ "@gmail.com"); // Randomly generated string
		logger.info("Provided email address...");
		 
		String password= randomAlphanumeric(); // randomly generated password
		repage.setPassword(password);
		logger.info("Provided password...");
		
		repage.setPrivacypolicy();
		repage.clickonContinue();
		logger.info("*** Congratulations, Your Account Registration is Successful ***");
		
	    
		
	}
	
	
	

}

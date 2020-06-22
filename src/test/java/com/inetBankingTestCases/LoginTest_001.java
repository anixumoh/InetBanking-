package com.inetBankingTestCases;

//import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingPageObject.LoginPage;

public class LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		
		//logger.info("Url is opened");

		driver.manage().window().maximize();

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered  username");

		lp.setPassword(password);
		logger.info("Entered  password");

		lp.clickSubmit();

		// if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		// {
		// Assert.assertTrue(true);
		// logger.info("Login test passed");
		// }
		// else
		// {
		// Assert.assertTrue(false);
		// logger.info("Login test failed");
		// }
		//

	}

}
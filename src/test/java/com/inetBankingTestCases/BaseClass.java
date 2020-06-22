package com.inetBankingTestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.inetBankingUtilities.ReadConfig;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();

	public String baseUrl = readconfig.getApplicationUrl();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassWord();

	public WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) 
	{

		logger = Logger.getLogger("inetBankingV1");
		PropertyConfigurator.configure("Log4j.properties");
		{
		System.setProperty("webDriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		 }
		 

		 driver.get(baseUrl);
		
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}

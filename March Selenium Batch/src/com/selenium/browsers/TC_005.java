package com.selenium.browsers;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		test=e.startTest("TC_004");
		
		init();
		log.info("Properties Objects  (config,OR,log4j) are getting initilized.....");
		test.log(LogStatus.INFO, "Properties Objects  (config,OR,log4j) are getting initilized.....");
		
		launch("chromebrowser");
		log.info("Opened the Browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to url :- " + p.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "Navigated to url :- " + p.getProperty("amazonurl"));

		String actualvalue = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String extectedvalue="customer Service";
		
		//Assert.assertEquals(actualvalue, extectedvalue);
		
		//Assert.assertTrue(actualvalue.equals(extectedvalue));
		
		SoftAssert s=new SoftAssert();
		//s.assertTrue(actualvalue.equals(extectedvalue));
		s.assertTrue(actualvalue.equals(extectedvalue), "Both Strings are not equal...");
		
		s.assertTrue(false, "error1");
		
		s.assertTrue(false, "error2");
		
		s.assertTrue(true, "error3");
		
		s.assertTrue(false, "error4");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("philips");
		
		s.assertAll();
	}

}

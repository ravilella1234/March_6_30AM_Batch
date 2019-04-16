package com.selenium.browsers;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_006.class.getName());
	
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
		
		
		if(!verifyText("customerservice_linktext", "Customer service"))
			reportFailure("Both Text are not equal");
		else
			reportPass("Both Text are equal");
		
		
		e.endTest(test);
		e.flush();

	}

}

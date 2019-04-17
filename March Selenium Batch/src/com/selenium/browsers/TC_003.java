package com.selenium.browsers;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class.getName());

	public static void main(String[] args) throws Exception 
	{
		test=e.startTest("TC_003");
		
		init();
		log.info("Properties Objects  (config,OR,log4j) are getting initilized.....");
		test.log(LogStatus.INFO, "Properties Objects  (config,OR,log4j) are getting initilized.....");
		
		launch("chromebrowser");
		log.info("Opened the Browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to url :- " + p.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "Navigated to url :- " + p.getProperty("amazonurl"));
		
		selectItem("amazondropdown_id",10);
		log.info("Selected the indexed item 10 by using locator :- " + or.getProperty("amazondropdown_id"));
		test.log(LogStatus.INFO, "Selected the indexed item 10 by using locator :- " + or.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_id","harry Potter");
		log.info("Entered the text - harry Potter by using locator :- " + or.getProperty("amazonsearchtext_id"));
		test.log(LogStatus.INFO, "Entered the text - harry Potter by using locator :- " + or.getProperty("amazonsearchtext_id"));
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on Search Button by using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.INFO, "Clicked on Search Button by using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
		e.endTest(test);
		e.flush();
		
	}
}

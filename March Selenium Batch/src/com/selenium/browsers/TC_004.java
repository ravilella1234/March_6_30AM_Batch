package com.selenium.browsers;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
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

		
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("philips");
		String actvalue = loc.getAttribute("value");
		System.out.println("Actual value is :" + actvalue);
		
		
		
		/*//String actualvalue = driver.findElement(By.linkText("Customer Service")).getText();
		String actualvalue = driver.findElement(By.linkText("Customer Service")).getAttribute("href");
		String extectedvalue="Customer Service";
		
		System.out.println("Actual Value :" + actualvalue);
		System.out.println("Expected Value :" + extectedvalue);
		
		//if(actualvalue.equals(extectedvalue))
		//if(actualvalue.equalsIgnoreCase(extectedvalue))
		//if(actualvalue.contains(extectedvalue))
		if(actualvalue.contentEquals(extectedvalue))
		{
			System.out.println("Both values are equal.....");
		}
		else
		{
			System.out.println("Both values are not equal.....");
		}*/
	}

}

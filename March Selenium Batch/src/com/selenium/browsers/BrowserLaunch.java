package com.selenium.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		driver=new InternetExplorerDriver();
		driver.get("https://www.bestbuy.com");
		
		driver=new EdgeDriver();
		driver.get("https://www.snapdeal.com");

	}

}

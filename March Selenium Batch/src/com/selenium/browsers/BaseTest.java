package com.selenium.browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fis;
	public static String projectPath="./";
	
	
	public static void init() throws Exception
	{
		p=new Properties();
		fis=new FileInputStream(projectPath+"//data.properties");
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equalsIgnoreCase("CHROME")){
			//System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\Browser_Drivers\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("ie")) {
			//System.setProperty("webdriver.ie.driver", "D:\\Browser_Drivers\\IEDriverServer.exe");
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver", "D:\\Browser_Drivers\\MicrosoftWebDriver.exe");
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	
	public static void navigate(String url) 
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
	}

}

package com.selenium.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		selectItem("amazondropdown_id",10);
		
		type("amazonsearchtext_id","harry Potter");
		
		click("amazonsearchbutton_xpath");
		
		
	}
}

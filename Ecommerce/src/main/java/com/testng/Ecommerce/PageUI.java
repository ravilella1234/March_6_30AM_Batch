package com.testng.Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUI 
{
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement customerEmail;
	@FindBy(id="passwd")WebElement customerPassword;
	@FindBy(id="SubmitLogin")WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")WebElement errorMesage;
	
	
	public PageUI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void loginPage()
	{
		signIn.click();
		customerEmail.sendKeys("qatest8457487@gmail.com");
		customerPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String getError()
	{
		String actualError = errorMesage.getText();
		return actualError;
	}
	

}

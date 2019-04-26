package pageobjectmodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.Ecommerce.BaseTest;
import com.testng.Ecommerce.PageUI;

public class Login extends BaseTest
{
 
	PageUI page;
	
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String browserType) throws Exception
  {
	  init();
	  launch(browserType);
	  navigate("automationurl");
  }
  
  @Test
  public void login() 
  {
	page=new PageUI(driver);
	page.loginPage();
	Assert.assertEquals(page.getError(), "Authentication failed.");
  }

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}

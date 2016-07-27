package com.nlsinc.java.FacebookProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
  
public class FacebookTestNG {
	public WebDriver driver;
	public String url;
	public String fname;
	public String lname;
	public String Email;
	public String confirmemail;
	public String Password;
	
	
  

  @BeforeClass
  public void beforeClass() {
	  url="https://www.facebook.com";
	  fname= "sharan";
	  lname="kumar";
	  Email= "sharan0212@gmail.com";
	  confirmemail= "sharan0212@gmail.com";
	  Password="pavan0212";  
	  
  }
  @Test
  public void DriverInitialization(){
	  
	driver=Basedriver1POM.getDriver(url);
  }
 
  
  
  @Test
  public void enterfname() throws InterruptedException{
  Facebookpage fb = new Facebookpage(driver);
  fb.enterfname("sharan");
  fb.enterlname("kumar");
  fb.enteremail("sharan0212@gmail.com");
  fb.confirmmail("sharan0212@gmail.com");
  fb.enterpwd("pavan0212");
  fb.entermonth();
  fb.enterday();
  fb.enteryear();
  fb.selectgender();
  fb.ClickonSignup();
  }
  

}

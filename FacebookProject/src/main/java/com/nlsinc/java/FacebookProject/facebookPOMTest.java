package com.nlsinc.java.FacebookProject;



import org.openqa.selenium.WebDriver;

public class facebookPOMTest {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.facebook.com/";
		WebDriver driver = Basedriver1POM.getDriver("firefox",url);
		
		Facebookpage Site = new Facebookpage(driver);
		Site.enterfname();
		Site.enterlname();
		Site.enteremail();
		Site.confirmmail();
		Site.enterpwd();
		Site.entermonth();
		Site.enterday();
        Site.enteryear();
        Site.selectgender();
        //Site.ClickonSignup();
        
	}

}

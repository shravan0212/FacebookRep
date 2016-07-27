package com.nlsinc.java.FacebookProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basedriver1POM {

	public static WebDriver getDriver(String url){
		WebDriver driver;
		//if(browserType != null && browserType=="firefox"){
			driver = new FirefoxDriver();
		//}
		/*else if(browserType != null && browserType=="chrome"){
			System.setProperty("webdriver.chrome.driver", "E:\\NSL-JAVA-SQL-QA\\SELENIUM\\chromedriver.exe");
			driver = new ChromeDriver();
		}*/
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

}

	}



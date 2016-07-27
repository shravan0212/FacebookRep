package com.nlsinc.java.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebookpage {

	WebDriver driver;
	
	By fname = By.id("u_0_1");
	By lname = By.id("u_0_3");
	By Email = By.id("u_0_6");
	By confirmemail = By.id("u_0_9");
	By Password = By.id("u_0_b");
	//By month = By.id("month");
	By smonth = By.xpath("//select[@id='month']/option[@value='4']");
	//By day = By.id("day");
	By sday = By.xpath("//select[@id='day']/option[@value='2']");
	//By year = By.id("year");
	By syear =	By.xpath("//select[@id='year']/option[@value='1990']");
	By male = By.xpath("//input[@id='u_0_f']");
	By Signup = By.id("u_0_j");

	public Facebookpage(WebDriver driver) {
		this.driver= driver;
		
	}
	
    public void enterfname(String name){
    	WebElement fname1 = driver.findElement(fname);
    	//String name1=fname1.getText();
		//System.out.println(name1);
		//fname1.click();
		//name1.sendKeys(emailAddr);
    	fname1.sendKeys(name);
    }
    
    public void enterlname(String name3){
    	WebElement lname1 = driver.findElement(lname);
    	lname1.sendKeys(name3);	
    }
    
    public void enteremail(String myemail) throws InterruptedException{
    	WebElement email = driver.findElement(Email);
    	email.sendKeys(myemail);
    	Thread.sleep(2000);
    	
    }
    public void confirmmail(String myemail1) throws InterruptedException{
    	WebElement Confirm = driver.findElement(confirmemail);
    	Confirm.sendKeys(myemail1);
    	Thread.sleep(2000);
    	
    }
    public void enterpwd(String paswrd) throws InterruptedException{
    	WebElement pwd= driver.findElement(Password);
    	pwd.sendKeys(paswrd);
    	Thread.sleep(2000);
    	}
    public void entermonth() throws InterruptedException{
    	WebElement month = driver.findElement(smonth);
    	month.click();
    	Thread.sleep(2000);
    }
    public void enterday() throws InterruptedException{
    	WebElement day = driver.findElement(sday);
    	day.click();
    	Thread.sleep(2000);
    }
    public void enteryear() throws InterruptedException{
    	WebElement year = driver.findElement(syear);
    	year.click();
    	Thread.sleep(2000);
    }
    public void selectgender(){
    	WebElement gender = driver.findElement(male);
    	gender.click();
    }
    public void ClickonSignup(){
    	WebElement Sign = driver.findElement(Signup);
    	Sign.click();
    }
}


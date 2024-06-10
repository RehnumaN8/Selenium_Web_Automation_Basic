package com.rehnuma.webelements;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class Webpages extends BaseDriver{
	
	@Test
	public void navigationTest() throws InterruptedException {
		
		driver.manage().window().maximize();
	  	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  	
	  	driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com']"));
	  	Thread.sleep(5000);
	  	driver.navigate().back();
	  	Thread.sleep(3000);
	  	
	  	driver.navigate().forward();
	  	Thread.sleep(3000);
	  	
	  	driver.navigate().refresh();
	  	Thread.sleep(3000);
	}
	

}

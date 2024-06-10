package com.rehnuma.webelements;

import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class BrowserCommands extends BaseDriver{
	
	@Test
	public void browserCommandExamples() {
		
	driver.manage().window().maximize();
  	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
  	
  	System.out.println(driver.getTitle());
  	
  	String actualTitle = driver.getTitle();
  	String expectedTitle = "Selenium Practice - Sturdent Registration Form";
  	
  	if(actualTitle.equals(expectedTitle)) {
  		System.out.println(driver.getTitle());
  	}
  	else {
  		System.out.println("Not Match");
  	}
  	
  	
  	System.out.println(driver.getCurrentUrl());
  	
	}
}

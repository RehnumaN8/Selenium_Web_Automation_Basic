package com.rehnuma.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class AlertExamples extends BaseDriver{
        
	
	//@Test
	public void alerts() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		//Xpath - And function -> //tagName[@attribute='value' and @attribute2= 'value'.....]
		WebElement first_alert = driver.findElement(By.xpath("//button[contains(text(),'Click Me') and @class='btn btn-primary']"));
		
		first_alert.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
	}
		
		@Test
		public void alertExample2() throws InterruptedException {
			
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			
			//Xpath - And function -> //tagName[@attribute='value' and @attribute2= 'value'.....]
			WebElement first_alert = driver.findElement(By.xpath("//button[contains(text(),'Click Me') and @onclick= myDisk()"));
			
			first_alert.click();
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(5000);
		
	}
	
}

package com.rehnuma.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class LocateByClassName extends BaseDriver {
       
	@BeforeClass
	public void OpenURL() {
		
		driver.get("https://www.daraz.com.bd");
	}
	
	
	@Test
	public void locateByClassName() throws InterruptedException {
		 
		WebElement button = driver.findElement(By.className("bld-txt"));
		button.click();
		Thread.sleep(5000);
	}
}

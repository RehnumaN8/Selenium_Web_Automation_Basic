package com.rehnuma.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class LocateByLinkText extends BaseDriver {
       
	@BeforeClass
	public void OpenURL() {
		
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void locateLink() throws InterruptedException {
		 
		WebElement forgetPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgetPassword.click();
		Thread.sleep(5000);
	}
}

package com.rehnuma.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class LocateByTagName extends BaseDriver {
       
	@BeforeClass
	public void OpenURL() {
		
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void locateByTagName() throws InterruptedException {
		 
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("Size: "+tags.size());
		System.out.println(tags);
	}
}

package com.rehnuma.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class WebElementsExample extends BaseDriver {
	
	/*@Test
	public void sendKeyExample() throws InterruptedException {
  	  
  	  driver.manage().window().maximize();
  	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
  	  
  	  WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
  	  element.sendKeys("Rehnuma");
  	  Thread.sleep(5000);

}*/
	
	//@Test
	public void clickExample() throws InterruptedException {
	  	  
	  	  driver.manage().window().maximize();
	  	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  	  
	  	  WebElement button = driver.findElement(By.xpath("//input[@id='gender']"));
	  	  button.click();
	  	  Thread.sleep(5000);
	}
	
	//@Test
	public void clearExample() throws InterruptedException {
	  	  
	  	  driver.manage().window().maximize();
	  	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  	  
	  	  WebElement firstName = driver.findElement(By.xpath("//input[@id='name']"));
	  	  firstName.sendKeys("Rehnuma");
	  	  Thread.sleep(5000);
	  	  firstName.clear();
	  	Thread.sleep(3000);
	  	  firstName.sendKeys("Naher");
	  	  Thread.sleep(5000);
	  	  
	}
	
	@Test
	public void getAttributeExample() throws InterruptedException {
	  	  
	  	  driver.manage().window().maximize();
	  	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  	  
	  	  WebElement firstName = driver.findElement(By.xpath("//input[@id='name']"));
	  	  Thread.sleep(5000);
	  	  System.out.println(firstName.getAttribute("placeholder"));
	}
	
}

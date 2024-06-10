package com.rehnuma.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rehnumanaher.BaseDriver;

public class RelativeXpathExamles extends BaseDriver{
	  
	
	  /*@Test
      public void relativeXpath() throws InterruptedException {
    	  
    	  driver.manage().window().maximize();
    	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    	  
    	  WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    	  firstname.sendKeys("Rehnuma"); //for sending data
    	  Thread.sleep(5000);*/
    	  
    	  @Test
    	  public void relativeXpathExample2() throws InterruptedException {
        	  
        	  driver.manage().window().maximize();
        	  driver.get("https://www.daraz.com.bd");
        	  
        	  WebElement flashSel = driver.findElement(By.xpath("//*[@class='page regional_bd']/div[4]/div[1]/h3"));
        	  Thread.sleep(5000);
        	  System.out.println(flashSel.getText());

}
      
}

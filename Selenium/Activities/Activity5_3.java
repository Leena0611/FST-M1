package SelenuimActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title: "+driver.getTitle());
		
		WebElement EnableInput = driver.findElement(By.xpath("//button[@id='toggleInput']"));
		int counter=0;
		
		for (int h=0; h<=4; h++) {
			clickEnInputBtn(driver, EnableInput, counter);
			
			counter++;
		}
		driver.close();
	}
	
	public static void clickEnInputBtn(WebDriver driver, WebElement AddOrRem, int countMsg) {
		
		AddOrRem.click();
		WebElement in = driver.findElement(By.xpath("//input[@id='input-text']"));
		
		if (in.isEnabled()==true) {
			
			in.clear();
			in.sendKeys("Message Typed when Counter = "+countMsg);
			System.out.println("Input Area is Enabled. Entered text: "+in.getAttribute("value"));
			
		}else {
			
			System.out.println("Input area "+in.getText() +" is Disabled when counter was = "+countMsg+" . No text Entered.");
			
		}
	}
	
	
	
	
	
	
	
	

}


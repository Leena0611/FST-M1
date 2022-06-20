package SelenuimActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Title : "+driver.getTitle());
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstName.sendKeys("Leena");
		lastName.sendKeys("Kedar");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kedarleena@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("80837383933");
		driver.findElement(By.xpath("//textarea")).sendKeys("Message");
		 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
		
	}
	

}

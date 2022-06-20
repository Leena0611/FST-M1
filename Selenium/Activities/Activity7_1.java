package SelenuimActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		
		driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin12");
		driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("pwd123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input")).sendKeys("pwd123");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("abc@gmailc.com");
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		System.out.println("Confirmation msg : "+driver.findElement(By.id("action-confirmation")).getText());
		
		driver.close();
	}

}

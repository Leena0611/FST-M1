package SelenuimActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Title: "+driver.getTitle());
		//name-6ffd3987-0e2c-1e9e-ffdc-0a6ecadb9fb8
		driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		System.out.println("Login Confirmation Message: "+driver.findElement(By.id("action-confirmation")).getText());
		
		driver.close();
	}

}

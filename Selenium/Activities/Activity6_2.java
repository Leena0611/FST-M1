package SelenuimActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/ajax");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		System.out.println("Title:"+driver.getTitle());
		driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
		
		By HelloText = By.xpath("//div[@id='ajax-content']/h1");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(HelloText, "HELLO!"));
		System.out.println("HelloText: "+driver.findElement(HelloText).getText());
		
		By LateText =By.xpath("//div[@id='ajax-content']/h3");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(LateText, "I'm late!"));
		System.out.println("LateText: "+driver.findElement(LateText).getText());
		
		driver.close();
	}

}

package SelenuimActivities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tab-opener");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Title of Page :"+driver.getTitle());
		WebElement ParentNewTabBtn = driver.findElement(By.id("launcher"));
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is :"+ParentHandle);
		ParentNewTabBtn.click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> wins = driver.getWindowHandles();
		for (String handle : wins) {
			if(handle!=ParentHandle) {
				driver.switchTo().window(handle);
			}
		}
		
		String newTab = driver.getWindowHandle();
		System.out.println("New tab handle is : "+newTab+" and Title is : " +driver.getTitle());
		
		Thread.sleep(20);
		driver.findElement(By.xpath("//a[@id='actionButton' and @class='ui inverted red button']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		Set<String> wins1 = driver.getWindowHandles();
		for (String handle : wins1) {
			if((handle!=ParentHandle) & (handle!=newTab)) {
				driver.switchTo().window(handle);
			}
		}
		
		String newTab2 = driver.getWindowHandle();
		System.out.println("New tab handle is : "+newTab2+" and Title is : " +driver.getTitle());
		//Loop to switch to all different windows.
		for (String handle:wins1) {
			driver.switchTo().window(handle);
		}
		
		
		
		driver.close();		

	}

}

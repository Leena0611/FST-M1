package SelenuimActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		System.out.println("Title:"+driver.getTitle());
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		WebElement AddOrRemoveBtn = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		AddOrRemoveBtn.click();//Remove
		
		wait.until(ExpectedConditions.invisibilityOf(chkbox));
		
		AddOrRemoveBtn.click();//Add
		
		wait.until(ExpectedConditions.visibilityOf(chkbox));
		chkbox.click();
		
		driver.close();

	}

}

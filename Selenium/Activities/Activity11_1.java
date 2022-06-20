package SelenuimActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		System.out.println("Title of Page :"+driver.getTitle());
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@id='simple']"));
		SimpleAlert.click();
		Thread.sleep(10);
		Alert alert =driver.switchTo().alert();
		
		System.out.println("Alert Text:"+alert.getText());
		alert.accept();
		
		driver.close();		

	}

}

package SelenuimActivities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Title of Page :"+driver.getTitle());
		WebElement ConfirmAlert = driver.findElement(By.xpath("//button[@id='confirm']"));
		
		ConfirmAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert ConfAlert = driver.switchTo().alert();
		
		System.out.println("Confirmation Alert text:"+ConfAlert.getText());
		
		ConfAlert.accept();
		
		driver.close();		

	}

}

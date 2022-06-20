package SelenuimActivities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Title of Page :"+driver.getTitle());
		WebElement PromptAlertBtn = driver.findElement(By.xpath("//button[@id='prompt']"));
		
		PromptAlertBtn.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("Yes, you are!");
		System.out.println("Prompt Alert text:"+PromptAlert.getText());
		
		PromptAlert.accept();
		
		driver.close();		

	}

}

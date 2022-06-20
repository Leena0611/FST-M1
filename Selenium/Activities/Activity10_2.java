package SelenuimActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/drag-drop");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Title:"+driver.getTitle());
		
		Actions actions = new Actions(driver);
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement zone1 = driver.findElement(By.id("droppable"));
		WebElement zone2 = driver.findElement(By.id("dropzone2"));
		
		Actions action1 = actions.dragAndDrop(ball, zone1);
		action1.build().perform();
		
		wait.until(ExpectedConditions.attributeToBeNotEmpty(zone1, "background-color"));
		System.out.println("Ball Dropped in Zone1");
		
		Actions action2 = actions.dragAndDrop(ball, zone2);
		action2.build().perform();
		
		wait.until(ExpectedConditions.attributeToBeNotEmpty(zone2, "background-color"));
		System.out.println("Ball Dropped in Zone2");
		
		driver.close();
	}
	
	public static String getKeysValue(WebDriver driver) {
		String keysPressed = driver.findElement(By.id("keyPressed")).getText();
		return keysPressed;
	}

}

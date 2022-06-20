package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println("Title:"+driver.getTitle());
		
		Actions action = new Actions(driver);
		
		action.sendKeys("LEENA").build().perform();
		System.out.println("Keys Pressed after entering name: "+getKeysValue(driver));
		
		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Keys Pressed after copy paste: "+getKeysValue(driver));
		
		driver.close();
	}
	
	public static String getKeysValue(WebDriver driver) {
		String keysPressed = driver.findElement(By.id("keyPressed")).getText();
		return keysPressed;
	}

}

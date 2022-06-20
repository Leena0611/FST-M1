package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println("Title:"+driver.getTitle());
		
		Actions action = new Actions(driver);
		WebElement oCube = driver.findElement(By.id("wrapD3Cube"));
		System.out.println("Cube value before any action: "+getCubeValue(driver));
		
		action.click(oCube).build().perform();
		System.out.println("Cube value after left click: "+getCubeValue(driver));
		
		action.doubleClick(oCube).build().perform();
		System.out.println("Cube value after double click: "+getCubeValue(driver));
		
		action.contextClick(oCube).build().perform();
		System.out.println("Cube value after right click: "+getCubeValue(driver));
		
		driver.close();
	}
	
	public static String getCubeValue(WebDriver driver) {
		String sCubValue = driver.findElement(By.className("active")).getText();
		return sCubValue;
	}

}

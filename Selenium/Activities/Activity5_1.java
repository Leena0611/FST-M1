package SelenuimActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title: "+driver.getTitle());
		
		CheckBoxIsVisible(driver);
		
		WebElement AddOrRem = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		String btnLabel = AddOrRem.getText();
		AddOrRem.click();
		System.out.println("Checkbox text is:"+btnLabel+" is clicked.");
		CheckBoxIsVisible(driver);
		
		String btnLabel1 = AddOrRem.getText();
		AddOrRem.click();
		System.out.println("Checkbox text is:"+btnLabel1+" is clicked.");
		CheckBoxIsVisible(driver);
		
		driver.close();
	}
	
	public static boolean CheckBoxIsVisible(WebDriver driver) {
		
		
		WebElement ch = driver.findElement(By.xpath("//input[@name='toggled']"));
		
		if (ch.isDisplayed()==true) {
			System.out.println("Checkbox"+ch.getText() +" is visible");
			return true;
		}else {
			System.out.println("Checkbox"+ch.getText() +" is not visible");
			return false;
		}

	}
	
	

}


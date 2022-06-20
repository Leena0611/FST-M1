package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement odropdown = driver.findElement(By.id("single-select"));
		Select sel = new Select(odropdown);
		
		sel.selectByVisibleText("Option 2");
		sel.selectByIndex(3);
		sel.selectByValue("4");
		List<WebElement> opts = sel.getOptions();
		System.out.println("All available options are as follows:");
		for (WebElement opt : opts){
			System.out.println(opt.getText());
		}
		
		driver.close();
	}

}

package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		//WebElement oMultiList = driver.findElement(By.id("multi-select"));
		Select sel = new Select(driver.findElement(By.id("multi-select")));
		
		if(sel.isMultiple()) {
			sel.selectByVisibleText("Javascript");
			sel.selectByValue("node");

			for(int i=4;i<=6;i++) {
				sel.selectByIndex(i);
			}
			sel.deselectByValue("node");
			sel.deselectByIndex(7);
			
			List<WebElement> opts = sel.getAllSelectedOptions();
			for(WebElement opt : opts) {
				System.out.println(opt.getText());
			}
			
			sel.deselectAll();
			
		}
		
		driver.close();
	}

}

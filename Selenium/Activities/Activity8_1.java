package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		//WebElement table = driver.findElement(By.xpath("//table[@class='ui celled striped table']"));
		
		System.out.println("Rows:"+driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr")).size());
		System.out.println("Columns: "+ driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td")).size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
		int counter = 1;
		for (WebElement value : thirdRow) {
			System.out.println("Cell value At column:"+counter+" Value is "+value.getText()+"\n");
			counter++;
		}
		
		System.out.println("Second Row, second column Value:"+driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]")).getText());
		driver.close();
	}

}

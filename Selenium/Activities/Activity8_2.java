package SelenuimActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		//WebElement table = driver.findElement(By.xpath("//table[@id='sortableTable']"));
		
		System.out.println("Rows:"+driver.findElements(By.xpath("//table[@id='sortableTable']//tbody/tr")).size());
		System.out.println("Columns: "+ driver.findElements(By.xpath("//table[@id='sortableTable']//tbody/tr[1]/td")).size());
		
		
		System.out.println("Second Row, second column Value Before Sorting:"+driver.findElement(By.xpath("//table[@id='sortableTable']//tbody/tr[2]/td[2]")).getText());
		
		//Sorting by first column--name
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		System.out.println("Second Row, second column Value After Sorting by Name:"+driver.findElement(By.xpath("//table[@id='sortableTable']//tbody/tr[2]/td[2]")).getText());
		
		int counter=1;
		List<WebElement> footValues = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
		for(WebElement foot : footValues) {
			System.out.println("Cell value At Foot Header , column:"+counter+" Value is "+foot.getText()+"\r\n");
			counter++;
		}
		driver.close();
	}

}

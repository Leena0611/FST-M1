package SelenuimActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net/");
			String title = driver.getTitle();
			System.out.println("Tile of this page is:"+title);
			
			WebElement oAboutUsID = driver.findElement(By.id("about-link"));
			System.out.println("Text in element:" + oAboutUsID.getText());
			
			WebElement oAboutUsClassName = driver.findElement(By.className("green"));
			System.out.println("Text in element:" + oAboutUsClassName.getText());
			
			WebElement oAboutUsLinkTxt = driver.findElement(By.linkText("About Us"));
			System.out.println("Text in element:" + oAboutUsLinkTxt.getText());
			
			WebElement oAboutUsCss = driver.findElement(By.cssSelector("#about-link"));
			System.out.println("Text in element:" + oAboutUsCss.getText());
			
			driver.close();
		}

}

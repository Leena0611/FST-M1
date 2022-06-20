package Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_LMS {
	WebDriver driver;
  
  @SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/lms/");
		
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
  
  @Test (priority=0)
  public void Activity1() {
	  	String sTitle = driver.getTitle();
    	String sActual = "Alchemy LMS – An LMS Application";
		Assert.assertEquals(sTitle, sActual);
  }
  
  @Test (priority=1)
  public void Activity2() {
	  String sheading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
	  String sActual = "Learn from Industry Experts";
	  Assert.assertEquals(sheading, sActual);
  }
  
  @Test (priority=2)
  public void Activity3() {
	  String sheading = driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();
	  String sActual = "Actionable Training";
	  Assert.assertEquals(sheading, sActual);
  }
  
  @Test (priority=3)
  public void Activity4() {
	  String secpopularCourse = driver.findElement(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 '][2]//h3")).getText();
	  String sActual = "Email Marketing Strategies";
	  Assert.assertEquals(secpopularCourse, sActual);
  }
  
  @Test (priority=4)
  public void Activity5() {
	  WebElement oMyAccTitle = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  String sMyAccTitle = oMyAccTitle.getText();
	  String sActual = "My Account";
	  Assert.assertEquals(sMyAccTitle, sActual);
	  oMyAccTitle.click();	//It will get clicked only if assertion passes.
  }
  
  @Test (dependsOnMethods= {"Activity5"})
  public void Activity6() {
	  WebElement ologinBtn = driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
	  ologinBtn.click();
	  WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//input[@id='wp-submit']"));
	  
	  String user = "root";
	  String pwd = "pa$$w0rd";
	  
	  userName.sendKeys(user);
	  password.sendKeys(pwd);
	  loginBtn.click();
	  
	  String sAccountName = driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']//span")).getText();
	  Assert.assertEquals(sAccountName, user);
	  
  }
  
  @Test (dependsOnMethods= {"Activity6"})
  public void Activity7() {
	  driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
	  List<WebElement> ele = driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
	  System.out.println("No of course are "+ele.size());
	  System.out.println("List of courses are:");
	  for (int i = 1;i<=ele.size();i++) {
		  By elem = By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']["+i+"]//h3");
  		  String courseName = driver.findElement(elem).getText();
  		  System.out.println(courseName);
	  }
  }
  
  @Test (dependsOnMethods= {"Activity6"})
  public void Activity8() {
	  driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	  
	  driver.findElement(By.xpath("//div[@id='wpforms-8-field_0-container']//input")).sendKeys("Leena");
	  driver.findElement(By.xpath("//div[@id='wpforms-8-field_1-container']//input")).sendKeys("Leena.Kedar@ibm.com");
	  driver.findElement(By.xpath("//div[@id='wpforms-8-field_3-container']//input")).sendKeys("training");
	  driver.findElement(By.xpath("//div[@id='wpforms-8-field_2-container']//textarea")).sendKeys("Message");
	  
	  driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
	  
	  String confMsg = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
	  Assert.assertEquals(confMsg, "Thanks for contacting us! We will be in touch with you shortly.");
	  
  }
  
  @Test (dependsOnMethods= {"Activity6"})
  public void Activity9() {
	  
	  //Will go to each course, assert status of 1st course content of each course.
	  for (int i=1;i<=3;i++) {
		  driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
		  
		  WebElement elem =driver.findElement(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']["+i+"]//a"));
  		  JavascriptExecutor js = (JavascriptExecutor) driver;
  		  js.executeScript("arguments[0].click();", elem);
  		  //clicking on 1st course content
  		  WebElement content = driver.findElement(By.xpath("//div[@class='ld-item-title']"));
  		  
  		  String sTitleContent = content.getText();
  		  String[] aTitleContent = sTitleContent.split("\n");
  		  
  		  content.click();
  		  
  		  Assert.assertTrue(driver.getTitle().contains(aTitleContent[0]));
  		  
  		  String status = driver.findElement(By.xpath("//div[@class='ld-status ld-status-complete ld-secondary-background']")).getText();
  		  Assert.assertEquals("COMPLETE",status);
  		  
  		  driver.navigate().back();
	  
	  }
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

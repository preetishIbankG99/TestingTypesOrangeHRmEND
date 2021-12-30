package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlert {
public static WebDriver driver;
	
@Test
public void handleAlert() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
   driver.manage().window().maximize();
  //driver.navigate().to("http://seleniumpractise.blogspot.com/2017/01/how-to-handle-promt-alert-in-selenium.html");
 driver.get("http://seleniumpractise.blogspot.com/2017/01/how-to-handle-alert-confirmation.html");
 driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
 driver.switchTo().alert().sendKeys("preetish"); 
 Thread.sleep(4000);
 driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
 WebElement text=driver.findElement(By.xpath("//p[@id='demo']"));
 String a_text=text.getText();
 System.out.println(a_text);
 String e_text="Hello preetish! How are you today?";
 Assert.assertEquals(a_text, e_text);
 System.out.println("Hurray Testcase Passed!!!!");
 
}
}

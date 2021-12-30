package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameEx {
public static WebDriver driver;	
@Test
public void frameHandle() {
	System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");
	WebElement frame=driver.findElement(By.xpath("//iframe[@id='google']"));
	driver.switchTo().frame(frame);
	WebElement in_frame=driver.findElement(By.xpath("//a[text()='Automation ']"));
	String text=in_frame.getText();
	System.out.println(text);
	
	
}
}

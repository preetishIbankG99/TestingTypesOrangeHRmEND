package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikhil extends TestBase{

@Test(priority=0)
public void checkingvalidinputs() {
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	
	
}
@Test(priority=1)
public void checkinginvalidinputs() {
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.findElement(By.id("txtPassword")).sendKeys("admin321");
	
	
}
	
}

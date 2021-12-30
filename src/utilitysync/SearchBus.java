package utilitysync;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchBus {
	public static WebDriver driver;
	@Test
	public void checkBuses(){
	System.setProperty("webdriver.chrome.driver", "../TestingTypes/Drivers/chromedriver.exe");	
	 driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	Utility.isElementPresnt(driver,"//input[@id='txtUsername']",20).sendKeys("Admin");
	 
	Utility.isElementPresnt(driver,"//input[@id='txtPassword']",20).sendKeys("admin123");
	}
}

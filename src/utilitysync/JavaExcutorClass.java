package utilitysync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaExcutorClass {
	public static WebDriver driver;
	@Test
	public void forefullyClick(){
	System.setProperty("webdriver.chrome.driver", "../TestingTypes/Drivers/chromedriver.exe");	
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	JavascriptExecutorex.javascriptExecutorHandle(driver, "//input[@id='btnLogin']");
	}
}

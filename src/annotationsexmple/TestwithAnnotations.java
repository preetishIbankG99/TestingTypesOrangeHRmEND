package annotationsexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestwithAnnotations {
	public static WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void setupSuite() {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
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
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
	driver.close();
	}
}

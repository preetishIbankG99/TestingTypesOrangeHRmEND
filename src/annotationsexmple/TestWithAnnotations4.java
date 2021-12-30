package annotationsexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWithAnnotations4 {
	public static WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void setupClass() {
		System.out.println("#####Setting Browser Environment#####");
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun = true)
	public void setupSuite() {
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
			driver.findElement(By.id("txtPassword")).sendKeys("adminxyz");
			
			}
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
	driver.close();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownAPP() {
	System.out.println("@@@@@APP CLOSED@@@@@");
	}
}

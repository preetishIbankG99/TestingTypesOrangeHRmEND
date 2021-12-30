package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BootStrapDropdown {
public static WebDriver driver;
	@Test
	public void handleBootstrap() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		//WebElement dd=driver.findElement(By.xpath("//button[@id='menu1']"));
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"Profile1\"]/div/dl/dt/a"));
//		Actions act=new Actions(driver);
//		act.contextClick(ele).build().perform();
//		Robot r=
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		String l = Keys.chord(Keys.CONTROL,Keys.ENTER);
		 driver.findElement(By.xpath ("//*[@id=\"Profile1\"]/div/dl/dt/a")).sendKeys(l);
	}
	
	
}

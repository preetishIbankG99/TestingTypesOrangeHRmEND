package shadowdomex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CloseShadoWEx2 {
	public static WebDriver driver;

	@Test
	public void browserSetup() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"userPass\"]")).click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("KumPreet").perform();
	
	
	}
}
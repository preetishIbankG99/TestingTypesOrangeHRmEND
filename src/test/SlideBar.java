package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SlideBar {
	public static WebDriver driver;
	   @Test
		public void dynamicData() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Slider.html");
		WebElement sliderpbar=driver.findElement(By.xpath("//div[@id='slider']"));
	   WebElement sliderbtn=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
	   Actions act=new Actions(driver);
	   Thread.sleep(9000);
	   //act.clickAndHold(sliderbtn).release(sliderpbar).build().perform();
	   act.dragAndDrop(sliderpbar, sliderbtn).build().perform();
	   }
}

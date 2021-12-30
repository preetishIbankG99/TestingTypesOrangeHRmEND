package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		/*//driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	WebElement src=	driver.findElement(By.xpath("//li[@name='C']"));
	WebElement dest=driver.findElement(By.xpath("//li[@name='A']"));
Actions act= new Actions(driver);
act.dragAndDrop(src, dest).build().perform();
Thread.sleep(6000);
WebElement src1=driver.findElement(By.xpath("//li[@name='G']"));
WebElement dest1=driver.findElement(By.xpath("//li[@name='K']"));
act.clickAndHold(src1).moveToElement(dest1).release(src1).build().perform();
	*/
/*driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame(0);
WebElement src1=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement dest1=driver.findElement(By.xpath("//div[@id='droppable']"));

Actions act= new Actions(driver);
//act.dragAndDrop(src1, dest1).build().perform();		
	act.clickAndHold(src1).moveToElement(dest1).release(src1).build().perform();*/	
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement framexpath=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(framexpath);
		Actions act= new Actions(driver);
		
		WebElement src1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		Thread.sleep(3000);
		WebElement dest1=driver.findElement(By.xpath("//div[@id='trash']"));
      // act.clickAndHold(src1).moveToElement(dest1).release(src1).build().perform();
		act.dragAndDrop(src1, dest1).build().perform();
	}

}

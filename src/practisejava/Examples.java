package practisejava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		
		e1.printStackTrace();
	}
	WebElement mobiletab=driver.findElement(By.xpath("//div[text()='Mobiles']"));
	mobiletab.click();
	Thread.sleep(4000);
	WebElement Electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
	Electronics.click();
	Thread.sleep(5000);
	WebElement Samsung=driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[3]"));
	Samsung.click();
	Thread.sleep(4000);
  List<WebElement>ele=driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
  
	for(WebElement e:ele) {
		e.getAttribute("href");
	}
	
	
	
	
}
}

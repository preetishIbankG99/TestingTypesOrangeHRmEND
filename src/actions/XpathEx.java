package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathEx {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Selenium");
	//driver.findElement(By.xpath("//*[@id=\"sbq-wrapabc\"]/div/div/div/ul/li[3]/span")).sendKeys("Selenium");
	//driver.findElement(By.xpath("//*[contains(@id,\"sbq-wrap\")]/div/div/div/ul/li[3]/span")).click();
	Thread.sleep(4000);
driver.findElement(By.xpath("//*[contains(@id,\"sbq-wr\")]/div/div/div/ul/li[3]/span")).click();

}
}

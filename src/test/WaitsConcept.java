package test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class WaitsConcept {
	public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	//Implicit
	/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();*/
	//Explicit Wait is element specific
	//WebDriverWait wait=new WebDriverWait(driver,5);
	//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
	 //code reusablility
//	By elelocator=By.linkText("Gmail");
//	waitForElementPresent(driver,elelocator,10).click();
//}	
	//Reuse able code
	
//	public static WebElement  waitForElementPresent(WebDriver driver,By locator,int timeout) {
//		WebDriverWait wait=new WebDriverWait(driver,timeout);
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		
	Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			.withTimeout(20,TimeUnit.SECONDS)
			.pollingEvery(5,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
	
	//usage of fluentwait
	WebElement element=wait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
		}});
element.click();
}}
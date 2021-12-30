package loggerfunctions;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ORANGEHRMTEST {
public static WebDriver driver;
public static Logger log;
	@Test
	  public void logProperties(){
	 log=Logger.getLogger("ORANGEHRMTEST");
	 PropertyConfigurator.configure("../TestingTypes/logFolder/log4j.properties");
	 System.setProperty("webdriver.chrome.driver", "../TestingTypes/Drivers/chromedriver.exe");	
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 log.info("#####URL NEIGALA#####");
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 log.info("@@@@@USERNAME BHI NEIGALA@@@@@");
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	 log.info("*****PASSWORD BHI NEIGALA*****");
	}}

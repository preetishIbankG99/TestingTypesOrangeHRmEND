package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDataHandle {
	public static WebDriver driver;
   @Test
	public void dynamicData() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/DynamicData.html");
	driver.findElement(By.xpath("//button[@id='save']")).click();
	Thread.sleep(5000);
	WebElement f_nm=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div/br[2]"));
	String f=f_nm.getText();
	System.out.println(f);
	WebElement l_nm=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div/br[4]"));
	String l=l_nm.getText();
	System.out.println(l);
	String fullnm=f.concat(" "+l);
	System.out.println(fullnm);
	

	}}

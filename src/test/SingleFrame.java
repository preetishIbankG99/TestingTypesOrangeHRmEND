package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {
	public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://demo.automationtesting.in/Frames.html");
	//WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
    driver.switchTo().frame("singleframe");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abvp");
	

}

}

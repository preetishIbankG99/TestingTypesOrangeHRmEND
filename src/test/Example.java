package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Example {
	public static WebDriver driver;
	@Test
	
	public void test() throws IOException { 
	
    
	System.setProperty("webdriver.chrome.driver", "../TestingTypes/Drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("http://www.google.com");
	//Capture full screenshot
	/*File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(f, new File("..\\TestingTypes\\screenshots\\screenshot.png"));
    System.out.println("Screenshot Taken Successfully");*/

    //Capture a Specific section Screenshot
    WebElement logo=driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
   File frc= logo.getScreenshotAs(OutputType.FILE);
    File trg=new File("..\\TestingTypes\\screenshots\\sectionscreenshot.png");
    FileHandler.copy(frc, trg);
    System.out.println("Particular Section Screenshot Taken!!!!!");
}
}
package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavascriptExec1 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		    System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		    WebElement username=driver.findElement(By.id("txtUsername"));
		    username.sendKeys("Admin");
			JavascriptExUtility.drawBorder(username, driver);
			//Screenshot
			File frc= username.getScreenshotAs(OutputType.FILE);
			    File trg=new File("..\\TestingTypes\\screenshots\\sectionscreenshot.png");
			    FileHandler.copy(frc, trg);
			    System.out.println("Particular Section Screenshot Taken!!!!!");
			    
		//Title
			   JavascriptExUtility.getTitleByJS(driver);
			   
	//Click Operations
			  /* WebElement footerlink=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a"));
			   JavascriptExUtility.clickElementByJS(footerlink, driver);*/
	
	//Alert popups
	
	//JavascriptExUtility.generateAlert(driver, "AlertGenerated");
	
		//Refresh Webpage	
			  // JavascriptExUtility.refreshWebpage(driver);
		//Scroll PageDown	 
			   //JavascriptExUtility.scrollPageDown(driver);
	
	//Scroll PageUp
			//   JavascriptExUtility.scrollPageUp(driver);
	
	JavascriptExUtility.zoomPage(driver);
	
	}


}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableJavascript {
public static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
	
		 //Sending values to disabled field
			((JavascriptExecutor)driver).executeScript("document.getElementById('pass').value='sanjay'"); //this is how , to use javascript to send value
       
			//Enabling disable checkbox and clicking it
        driver.get("file:///C:/Users/GUDU/Desktop/disable.html");
       
        WebElement yourButton= driver.findElement(By.xpath("//input[@value='Biology']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled','disabled')",yourButton);
         yourButton.click();
      

	}

}

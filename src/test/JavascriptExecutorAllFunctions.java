package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorAllFunctions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/'");
js.executeScript("document.getElementById('txtUsername').value='GUDDU'");
js.executeScript("(document.getElementsByTagName('input'))[6].value='123'");
	for(int i=0;i<3;i++) {
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,400)");
	}
	Thread.sleep(400);
	js.executeScript("history.go(0)");
	}

}

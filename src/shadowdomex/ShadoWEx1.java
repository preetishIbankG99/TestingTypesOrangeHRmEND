package shadowdomex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadoWEx1 {
	public static WebDriver driver;

	@Test
	public void browserSetup() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	driver.manage().window().maximize();
	driver.switchTo().frame("pact");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	WebElement element=(WebElement) jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
	String js="arguments[0].setAttribute('value','Zinger Tea')";
	jse.executeScript(js, element);
}
}
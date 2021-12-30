package shadowdomex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowPawan {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://books-pwakit.appspot.com/");
	driver.manage().window().maximize();
	WebElement root=driver.findElement(By.tagName("book-app"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement shadowDom1=(WebElement) js.executeScript("return arguments[0].shadowRoot", root);
    WebElement appheader=shadowDom1.findElement(By.tagName("app-header"));
	WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	WebElement bookinputdecorator=apptoolbar.findElement(By.tagName("book-input-decorator"));
bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Preetish");
}
}

package utilitysync;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorex {
public  static void javascriptExecutorHandle(WebDriver driver,String xpath) {
	WebElement ele = null;
	ele=driver.findElement(By.xpath(xpath));
	
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", ele);
}
}

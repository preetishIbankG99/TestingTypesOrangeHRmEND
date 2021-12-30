package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GoogleValidation {
	public static WebDriver driver;

	@Test
	public void google() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement dd_box=driver.findElement(By.xpath("//select[@type='text' and @id='Skills']"));
	Select sel=new Select(dd_box);
	List<WebElement>items=sel.getOptions();
	for(WebElement item:items) {
		System.out.println(item.getText());
		if(item.getText().equals("Android")) {
			item.click();
		}
		
	}
	
	
	}
}
package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		WebElement drpdwn=driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select sel=new Select(drpdwn);
		sel.selectByValue("Physics");

	}

}

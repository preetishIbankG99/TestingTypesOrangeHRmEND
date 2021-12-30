package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressbarTest {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/ProgressBar.html");
	    WebElement dwnld=driver.findElement(By.xpath("//button[@id='cricle-btn']"));
	    boolean b=dwnld.isDisplayed();
	    System.out.println(b);//true
	    dwnld.click();
	    Thread.sleep(9000);
	    WebElement status=driver.findElement(By.xpath("//div[@class='progressbar-text']"));
        System.out.println(status.getText());
	}

}

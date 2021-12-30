package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {
public static WebDriver driver;	
@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-tooltip-in-selenium.html");
		WebElement tooltip_xpath=driver.findElement(By.xpath("//div[@class='tooltip']"));
        Actions act=new Actions(driver);
        act.moveToElement(tooltip_xpath).build().perform();
        WebElement tooltip_text=driver.findElement(By.xpath("//span[@class='tooltiptext']"));
       String text= tooltip_text.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Tooltip text");
        System.out.println("ToolTip Matched Hurray!!!");
	}
}
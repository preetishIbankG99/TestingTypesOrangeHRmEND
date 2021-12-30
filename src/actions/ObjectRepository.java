package actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	public static WebDriver driver;
	@Test
	public void readfromConfigFile() throws FileNotFoundException,IOException {
	File f=new File("../TestingTypes/Config_Properties/object.properties");
	FileInputStream fi=new FileInputStream(f);
	Properties p=new Properties();
	p.load(fi);
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(p.getProperty("url"));
	driver.manage().window().maximize();
	driver.findElement(By.xpath(p.getProperty("user_xpath"))).sendKeys(p.getProperty("username_field"));
	driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password_field"));
	
	}

}

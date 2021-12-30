package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceLabz1 {
public WebDriver driver=null;
public static final String USERNAME="oauth-preetishbhanjadeo-5c1f0";
public static final String ACCESS_KEY="49925df3-9357-4fce-9fe7-c067f2c09c21";
public static final String URL="https://"+ USERNAME +":"+ACCESS_KEY+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

@BeforeClass
@Parameters({"browser","version","platform"})
public void setup(String br,String vr,String pf) throws MalformedURLException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("browser", br);
	cap.setCapability("version", vr);
	cap.setCapability("platform", pf);
	driver=new RemoteWebDriver(new java.net.URL(URL),cap);
	
}
@Test
public void verifyLogin() {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	//login
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
}
@AfterClass
public void tearDown() {
	driver.close(); 
}
}

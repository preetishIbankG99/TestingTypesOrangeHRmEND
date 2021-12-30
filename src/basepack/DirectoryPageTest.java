package basepack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DirectoryPageTest extends MasterTestBase{
	@Test(priority=1)
	public void directoryPage() throws IOException, InterruptedException {
	driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("username_field"));
	logger.info("UserName Entered");
	driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password_field"));
	logger.info("PassWord Entered");
	driver.findElement(By.id("btnLogin")).click();
	logger.info("Button Clicked");
	DirectoryPageTab dp=new DirectoryPageTab(driver);
	dp.clickDirectory();
	logger.info("DirectoryTab Clicked");
	dp.enterName("Odis Adalwin");
	logger.info("Name Entered");
	dp.jobTitle("3");
	logger.info("JobTitle Entered");
	dp.locationField("1");
	logger.info("LocationField Entered");
	}}

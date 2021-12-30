package basepack;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC_001_LoginTest extends MasterTestBase {
	
@Test(priority=1)
public void validCredentials() throws IOException {
	driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("username_field"));
	logger.info("UserName Entered");
	driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password_field"));
	logger.info("PassWord Entered");
	driver.findElement(By.id("btnLogin")).click();
	logger.info("Button Clicked");
	if(driver.getTitle().equals("OrangeHRM")) {
		Assert.assertTrue(true);
		logger.info("LoginTest Passed");
	}
	else {
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("LoginTest Failed");
	}
}
	@Test(priority=2)
	public void checkingHomepageFeatures() throws IOException, InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("username_field"));
		logger.info("UserName Entered");
		driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password_field"));
		logger.info("PassWord Entered");
		driver.findElement(By.id("btnLogin")).click();
		logger.info("Button Clicked");
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img"));
		boolean b=logo.isDisplayed();
		Assert.assertTrue(b);
        logger.info("Logo Verified!!!");
        WebElement admintab=driver.findElement(By.xpath("//b[text()='Admin']"));
        JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", admintab);
		logger.info("Admin Tab Clicked");
		Thread.sleep(4000);
        WebElement addBtn=driver.findElement(By.id("btnAdd"));
        jse.executeScript("arguments[0].click()",addBtn );
        logger.info("Add Button Clicked");
        WebElement ddown=driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
        jse.executeScript("document.getElementById('systemUser_userType')",ddown);
        Select sel=new Select(ddown);
        sel.selectByValue("1");
        Thread.sleep(3000);
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Fiona Grace");
        WebElement ddown2=driver.findElement(By.xpath("//select[@id='systemUser_status']"));
        Select sele=new Select(ddown2);
        sele.selectByValue("1");
        driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Xcvb12@");
        driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Xcvb12@");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
}

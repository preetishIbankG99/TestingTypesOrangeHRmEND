package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BaseValidation extends TestBase{
@Test(priority=1)
public void validCredentials() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();

}
@Test(priority=2)
public void invalidCredentials() {
	driver.findElement(By.id("txtUsername")).sendKeys("Preetish");
    driver.findElement(By.id("txtPassword")).sendKeys("preetish123");
    driver.findElement(By.id("btnLogin")).click();
   Assert.assertTrue(false);
}

@Test(priority=3)
public void skipCredentials() {
	throw new SkipException("hii");
	
   

}


}

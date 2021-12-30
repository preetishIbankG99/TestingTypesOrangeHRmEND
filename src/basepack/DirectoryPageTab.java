package basepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectoryPageTab {
WebDriver ldriver;
	
	public DirectoryPageTab(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//b[text()='Directory']")
	@CacheLookup
	WebElement directoryTab;
	@FindBy(how = How.ID, using ="searchDirectory_emp_name_empName")
	@CacheLookup
	WebElement nameField;
	@FindBy(how = How.XPATH, using="//select[@id='searchDirectory_job_title']")
	@CacheLookup
	WebElement jobTitle_DD;
	@FindBy(how = How.ID, using ="searchDirectory_location")
	@CacheLookup
	WebElement locationField_DD;
	
	public void clickDirectory() throws InterruptedException {
	//	directoryTab.click();
		JavascriptExecutor jse=(JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", directoryTab);
	}

    public void enterName(String uname) {
    	 WebDriverWait wait = new WebDriverWait(ldriver,30);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDirectory_emp_name_empName")));
    	nameField.sendKeys(uname);
//    	FluentWait wait = new FluentWait(ldriver)							
//    			.withTimeout(Duration.ofSeconds(30)) 			
//    			.pollingEvery(Duration.ofSeconds(5)) 			
//    			.ignoring(NoSuchElementException.class);
//           wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDirectory_emp_name_empName")));
//           nameField.sendKeys(uname);
    }
    public void jobTitle(String val) throws InterruptedException {
    Select jobsel=new Select(jobTitle_DD);
    Thread.sleep(4000);
    jobsel.selectByValue(val);
    }
    public void locationField(String lval) throws InterruptedException {
    	Select locsel=new Select(locationField_DD);
        Thread.sleep(4000);
        locsel.selectByValue(lval);
    }

	
    
    
    
}

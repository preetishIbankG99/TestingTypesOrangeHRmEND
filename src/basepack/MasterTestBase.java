package basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import basepack.WebEventListener;

public class MasterTestBase {
public static WebDriver driver;
public Logger logger;
public Properties p;
public  static EventFiringWebDriver e_driver;
public static WebEventListener eventListener;
@Parameters("browser")

@BeforeMethod
//@BeforeClass
public void setUpBrowser(String brow) throws IOException,FileNotFoundException {
	File f=new File("../TestingTypes/Config_Properties/object.properties");
	FileInputStream fi=new FileInputStream(f);
    p=new Properties();
	p.load(fi);
	logger = Logger.getLogger("OrangeHrm");
	PropertyConfigurator.configure("../TestingTypes/logFolder/log4j.properties");
	if(brow.equals("chrome"))
	{
	logger.info("App Launch Started For Chrome Browser");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if(brow.equals("firefox"))
	{
		logger.info("App Launch Started For Firefox Browser");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	else if(brow.equals("opera"))
	    {
		logger.info("App Launch Started For Opera Browser");
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
		}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	e_driver=new EventFiringWebDriver(driver);
    eventListener=new WebEventListener();
    e_driver.register(eventListener);
    driver=e_driver;
	driver.manage().window().maximize();
	logger.info("Browser Maximized");
	driver.get(p.getProperty("url"));
	logger.info("Url Entered");
	}

//@AfterClass
@AfterMethod
public void tearDown() {
	driver.close();
}
	
public void captureScreen(WebDriver driver, String tname) throws IOException {
	DateFormat df=new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
	Date d=new Date();
	String Time=df.format(d);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png"+Time);
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
/*@AfterSuite
public void generateReport()throws Exception
{
	Xl.generateReport("Report_Excel.xlsx");
}*/
}

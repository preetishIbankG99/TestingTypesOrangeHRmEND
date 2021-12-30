package capablties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CapAbilitiesEx {
	@Test
	public void capabilitiesCheck() {
	System.setProperty("webdriver.chrome.driver","../TestingTypes/Drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(capabilities);
	ChromeDriver driver = new ChromeDriver(options);		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//options.addArguments("start-maximized");
	String title = driver.getTitle();
	System.out.println("Page Title: " +title);
	driver.quit();
}}

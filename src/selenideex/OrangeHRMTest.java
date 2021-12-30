package selenideex;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$$;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class OrangeHRMTest {
	public static WebDriver driver;
@Test
public void orangehrmtest() throws InterruptedException {
	/*System.setProperty("webdriver.geckodriver.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\geckodriver.exe");
    // set the browser name to IE
    System.setProperty("selenide.browser", "Internet Explorer");*/
	
	  System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
      // set the browser name to chrome
      System.setProperty("selenide.browser", "Chrome");
      
   //   Configuration.browser="firefox";
   // open("https://opensource-demo.orangehrmlive.com/");
    open("https://mail.rediff.com/cgi-bin/login.cgi");
    $(By.name("proceed")).click();
    Thread.sleep(4000);
    //WebDriverRunner.getWebDriver().switchTo().alert();
    
   //or
    //Alert alert= switchTo().alert();
   // String text=alert.getText();
    //System.out.println(text);
//    Assert.assertEquals(text, "Please enter a valid user name");
    //alert.accept();
    //alert.dismiss();
    //alert.sendKeys("abc");
    //System.out.println(title());
    //open("https://www.google.com/");
    //back();
    //forward();
    
	$(By.id("txtUsername")).setValue("Admin");
//	$(By.name("txtPassword")).setValue("admin123");
//	$(By.xpath("//*[@id=\"btnLogin\"]")).click();
//	$(By.xpath("//*[@id=\"branding\"]/a[1]/img")).shouldHave(Condition.appear);
	//int headercount=$$(By.cssSelector(".firstLevelMenu")).size();
	//System.out.println(headercount);

//FindElements Concepts
    ElementsCollection colls=$$(By.tagName("a"));
    System.out.println(colls.size());
//    for(SelenideElement e:colls) {
//    	String text=e.getText();
//    	String href=e.getAttribute("href");
//    	System.out.println(text +" -- "+ href);
//    }
    
    colls.shouldHave(CollectionCondition.sizeLessThan(400));
   // colls.forEach(e ->System.out.println(e.getText()));
   //colls.stream().filter(e -> !e.getText().isEmpty()).forEach(e ->System.out.println(e.getText())) ;
    colls.last(10).forEach(e ->System.out.println(e.getText()));
}
}

package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExUtility {
//Drawing Border
	public static void drawBorder(WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border='3px solid red'",element);
	}	
//Getting Title
	public static void getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		}
//ClickElement By JS
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

//Generate Alert
	
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}

//Refresh WebPage
	public static void refreshWebpage(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
//scroll Page Down
		public static void scrollPageDown(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}
		
//scroll Page Up	
		public static void scrollPageUp(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		}		
//Zoom PAge
			public static void zoomPage(WebDriver driver) {
				JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("document.body.style.zoom='50%'");
			
			
		
		
		
	}
		
		
		
}
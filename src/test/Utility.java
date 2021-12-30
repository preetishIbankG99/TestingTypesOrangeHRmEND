package test;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
	DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
	Date d =new Date();
	String Time=df.format(d);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(f, new File("E:\\Eclipse All versions\\Workspace\\TestingTypes\\screenshots\\"+filename+".png"+Time));
	}
}

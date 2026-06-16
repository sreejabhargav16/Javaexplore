package automationCore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenShotUtility;

public class Base {
Properties prop;
FileInputStream file;
public WebDriver driver;
@BeforeMethod(alwaysRun=true)
@Parameters("browsers")
public void initialiseBrowser(String browsers) throws IOException  
{
	prop=new Properties();
	file=new FileInputStream(Constant.configfile);
	prop.load(file);
	if(browsers.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	
	else if(browsers.equalsIgnoreCase("FireFox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browsers.equalsIgnoreCase("Edge"))
	{
		WebDriverManager.edgedriver();
		driver=new EdgeDriver();
	}
	
	driver.get(prop.getProperty("url"));//opens the url
	driver.manage().window().maximize();
}
@AfterMethod(alwaysRun=true)	
public void closeBrowser(ITestResult itestresult) throws IOException
{
	if(itestresult.getStatus()==ITestResult.FAILURE)
	{
		ScreenShotUtility screenshotutility=new ScreenShotUtility();
		screenshotutility.getScreenshot(driver,itestresult.getName());
	}
	
	//driver.quit();
	//driver.close();
}
	}



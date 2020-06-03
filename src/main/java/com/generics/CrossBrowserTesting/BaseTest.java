package com.generics.CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(firefoxKey, firefoxValue);
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chromeKey, chromeValue);
			driver=new ChromeDriver();
		}
		
		else
		{
			System.setProperty(ie_Key, ie_Value);
			driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}

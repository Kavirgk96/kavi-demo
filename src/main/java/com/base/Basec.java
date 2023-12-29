package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basec {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")
				) {
			
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}
	
}
